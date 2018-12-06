package eaiproject.eaiprojectInventory.data.domain;

import java.util.List;

import javax.persistence.*;

@Entity
public class PackingSlip {
	
	@Id @GeneratedValue
	private Integer packingSlipId;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "packing_slip_fk")
	private List<Shampoo> shampoos;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "order_fk")
	private Order order;
	
	public PackingSlip(){
		super();
	}

	
	public PackingSlip(Integer packingSlipId) {
		this.packingSlipId = packingSlipId;
	}


	public Integer getPackingSlipId() {
		return packingSlipId;
	}

	public void setPackingSlipId(Integer packingSlipId) {
		this.packingSlipId = packingSlipId;
	}
	

	
}
