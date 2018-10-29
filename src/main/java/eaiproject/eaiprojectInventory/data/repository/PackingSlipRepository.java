package eaiproject.eaiprojectInventory.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import eaiproject.eaiprojectInventory.data.domain.PackingSlip;


public interface PackingSlipRepository extends JpaRepository<PackingSlip, Integer>{
	
	public PackingSlip findPackingSlipByPackingSlipId(@Param("packing_slip_id") Integer PackingSlipId);

}
