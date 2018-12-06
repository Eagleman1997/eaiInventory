package eaiproject.eaiprojectInventory.data.domain;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "ORDER_TABLE")
public class Order {
	
	@Id
	private Integer orderId;
	private Double total_order_price;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "order_fk")
	private List<Shampoo> shampoos;
	
	@OneToOne(mappedBy = "order", cascade = CascadeType.ALL)
	private PackingSlip packing_slip;
	
	public Order() {
		super();
	}

	public Order(Integer orderId, Double total_order_price) {
		this.orderId = orderId;
		this.total_order_price = total_order_price;
	}
	
	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}


}
