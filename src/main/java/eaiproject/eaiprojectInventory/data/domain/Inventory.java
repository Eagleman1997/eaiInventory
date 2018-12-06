package eaiproject.eaiprojectInventory.data.domain;

import java.util.List;

import javax.persistence.*;

@Entity
public class Inventory {
	
	@Id @GeneratedValue
	private Integer inventoryId;
	private Integer shampoo_id;
	private Integer amount_of_stock;
	private String location;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "inventory_fk")
	private List<Shampoo> shampoos;
	
	public Inventory(){
		super();
	}
	
	
	
	public Inventory(Integer inventoryId, Integer shampooId, Integer amount_of_stock, String location) {
		this.inventoryId = inventoryId;
		this.shampoo_id = shampooId;
		this.amount_of_stock = amount_of_stock;
		this.location = location;
	}



	public Integer getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(Integer inventoryId) {
		this.inventoryId = inventoryId;
	}

	public Integer getShampoo_id() {
		return shampoo_id;
	}

	public void setShampoo_id(Integer shampooId) {
		this.shampoo_id = shampooId;
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
