package eaiproject.eaiprojectInventory.data.domain;

import java.util.List;

import javax.persistence.*;

@Entity
public class Customer {
	
	@Id @GeneratedValue
	private Integer customer_id;
	private String first_name;
	private String last_name;
	private String shipping_address_name;
	private String shipping_address_street;
	private String shipping_address_location;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "customer_fk")
	private List<Order> orders;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "customer_fk")
	private List<PackingSlip> packing_slips;
	

	public Customer() {
		super();
	}
	
}