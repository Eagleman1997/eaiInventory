package eaiproject.eaiprojectInventory.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import eaiproject.eaiprojectInventory.data.domain.Order;


public interface OrderRepository extends JpaRepository<Order, Integer>{
	
	public List<Order> findOrderByOrderId(@Param("order_id") Integer OrderId);

}