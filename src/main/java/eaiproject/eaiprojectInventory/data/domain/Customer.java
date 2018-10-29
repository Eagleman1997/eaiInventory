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


	public Customer(Integer customer_id, String first_name, String last_name, String shipping_address_name,
			String shipping_address_street, String shipping_address_location) {
		this.customer_id = customer_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.shipping_address_name = shipping_address_name;
		this.shipping_address_street = shipping_address_street;
		this.shipping_address_location = shipping_address_location;
	}


	public Integer getCustomer_id() {
		return customer_id;
	}


	public void setCustomer_id(Integer customer_id) {
		this.customer_id = customer_id;
	}


	public String getFirst_name() {
		return first_name;
	}


	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}


	public String getLast_name() {
		return last_name;
	}


	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}


	public String getShipping_address_name() {
		return shipping_address_name;
	}


	public void setShipping_address_name(String shipping_address_name) {
		this.shipping_address_name = shipping_address_name;
	}


	public String getShipping_address_street() {
		return shipping_address_street;
	}


	public void setShipping_address_street(String shipping_address_street) {
		this.shipping_address_street = shipping_address_street;
	}


	public String getShipping_address_location() {
		return shipping_address_location;
	}


	public void setShipping_address_location(String shipping_address_location) {
		this.shipping_address_location = shipping_address_location;
	}


	public List<Order> getOrders() {
		return orders;
	}


	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}


	public List<PackingSlip> getPacking_slips() {
		return packing_slips;
	}


	public void setPacking_slips(List<PackingSlip> packing_slips) {
		this.packing_slips = packing_slips;
	}
	
}