package eaiproject.eaiprojectInventory.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import eaiproject.eaiprojectInventory.data.domain.Order;

/**
 * For searching the order in de DB
 * @param orderId
 * @author Lukas Weber
 */
@Repository
public interface OrderRepository extends JpaRepository<Order, Integer>{
	
	public List<Order> findOrderByOrderId(@Param("orderId") Integer OrderId);

}