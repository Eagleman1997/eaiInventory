package eaiproject.eaiprojectInventory.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import eaiproject.eaiprojectInventory.data.domain.PackingSlip;


/**
 * For searching the packingSlip in de DB
 * @param PackingSlipId
 * @author Lukas Weber
 */
@Repository
public interface PackingSlipRepository extends JpaRepository<PackingSlip, Integer>{
	
	public PackingSlip findPackingSlipByPackingSlipId(@Param("packingSlipId") Integer PackingSlipId);

}
