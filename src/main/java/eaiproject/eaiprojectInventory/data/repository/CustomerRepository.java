package eaiproject.eaiprojectInventory.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import eaiproject.eaiprojectInventory.data.domain.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	
	public Customer findCustomerByCustomerId(@Param("customer_id") Integer CustomerId);

}
