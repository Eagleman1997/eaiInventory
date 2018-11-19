/*
 * Copyright (c) 2018. University of Applied Sciences and Arts Northwestern Switzerland FHNW.
 * All rights reserved.
 */

package eaiproject.eaiprojectInventory.stream.listener;

import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import eaiproject.eaiprojectInventory.business.service.InventoryService;
import eaiproject.eaiprojectInventory.data.domain.Order;
import eaiproject.eaiprojectInventory.data.domain.PackingSlip;
import eaiproject.eaiprojectInventory.data.domain.Shampoo;
import eaiproject.eaiprojectInventory.stream.message.EventMessage;
import eaiproject.eaiprojectInventory.stream.message.OrderMessage;
import eaiproject.eaiprojectInventory.stream.sender.MessageEventSender;

@Component
@EnableBinding(Sink.class)
public class MessageEventListener {

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private MessageEventSender messageEventSender;

    @Autowired
    private InventoryService inventoryService;

    private static Logger logger = LoggerFactory.getLogger(MessageEventListener.class);

    @StreamListener(target = Sink.INPUT,
            condition="(headers['type']?:'')=='FetchGoods'")
    @Transactional
    public void payment(@Payload EventMessage<OrderMessage> eventMessage) throws Exception {
        OrderMessage orderMessage = eventMessage.getPayload();
        logger.info("Payload received: "+orderMessage.toString());
        List<Shampoo> orderItems = objectMapper.convertValue(orderMessage.getItems(), new TypeReference<List<Shampoo>>() {});
        PackingSlip packingSlip = inventoryService.fetchGoods(Long.valueOf(orderMessage.getCustomerId()), orderMessage.getOrderId(), orderItems);
        orderMessage.setPackingSlipId(packingSlip.getPacking_slip_id().toString());
        orderMessage.setStatus("GoodsFetched");
        messageEventSender.send(new EventMessage<>("ShipGoods", orderMessage));
    }


}
