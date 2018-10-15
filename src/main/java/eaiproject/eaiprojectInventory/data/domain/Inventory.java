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

}
