package eaiproject.eaiprojectInventory.data.domain;

import java.util.List;

import javax.persistence.*;

@Entity
public class PackingSlip {
	
	@Id @GeneratedValue
	private Integer packing_slip_id;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "packing_slip_fk")
	private List<Shampoo> shampoos;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "order_fk")
	private Order order;
	
	public PackingSlip(){
		super();
	}

}
