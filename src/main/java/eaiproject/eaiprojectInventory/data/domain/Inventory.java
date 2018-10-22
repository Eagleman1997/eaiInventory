package eaiproject.eaiprojectInventory.data.domain;

import java.util.List;

import javax.persistence.*;

@Entity
public class Inventory {
	
	@Id @GeneratedValue
	private Integer inventory_id;
	private Integer shampoo_id;
	private Integer amount_of_stock;
	private String location;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "inventory_fk")
	private List<Shampoo> shampoos;
	
	public Inventory(){
		super();
	}
	
	
	
	public Inventory(Integer inventory_id, Integer shampoo_id, Integer amount_of_stock, String location) {
		this.inventory_id = inventory_id;
		this.shampoo_id = shampoo_id;
		this.amount_of_stock = amount_of_stock;
		this.location = location;
	}



	public Integer getInventory_id() {
		return inventory_id;
	}

	public void setInventory_id(Integer inventory_id) {
		this.inventory_id = inventory_id;
	}

	public Integer getShampoo_id() {
		return shampoo_id;
	}

	public void setShampoo_id(Integer shampoo_id) {
		this.shampoo_id = shampoo_id;
	}

	public Integer getAmount_of_stock() {
		return amount_of_stock;
	}

	public void setAmount_of_stock(Integer amount_of_stock) {
		this.amount_of_stock = amount_of_stock;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Shampoo> getShampoos() {
		return shampoos;
	}

	public void setShampoos(List<Shampoo> shampoos) {
		this.shampoos = shampoos;
	}

}
