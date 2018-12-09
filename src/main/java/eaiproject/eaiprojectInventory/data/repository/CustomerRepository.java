package eaiproject.eaiprojectInventory.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import eaiproject.eaiprojectInventory.data.domain.Customer;

/**
 * For searching the customer in de DB
 * @param customerId
 * @author Lukas Weber
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	
	public Customer findCustomerByCustomerId(@Param("customerId") Integer CustomerId);

}
