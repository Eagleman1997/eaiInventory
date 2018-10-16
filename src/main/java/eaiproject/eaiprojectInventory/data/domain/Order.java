package eaiproject.eaiprojectInventory.data.domain;

import java.util.List;

import javax.persistence.*;

@Entity
public class Order {
	
	@Id
	private Integer order_id;
	private Double total_order_price;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "order_fk")
	private List<Shampoo> shampoos;
	
	@OneToOne(mappedBy = "order", cascade = CascadeType.ALL)
	private PackingSlip packing_slip;
	
	public Order() {
		super();
	}

}
