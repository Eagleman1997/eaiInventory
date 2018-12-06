package eaiproject.eaiprojectInventory.data.domain;

import java.util.List;

import javax.persistence.*;

@Entity
public class Inventory {
	
	@Id @GeneratedValue
	private Integer inventoryId;
	private Integer shampooId;
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
		this.shampooId = shampooId;
		this.amount_of_stock = amount_of_stock;
		this.location = location;
	}



	public Integer getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(Integer inventoryId) {
		this.inventoryId = inventoryId;
	}

	public Integer getShampooId() {
		return shampooId;
	}

	public void setShampooId(Integer shampooId) {
		this.shampooId = shampooId;
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
