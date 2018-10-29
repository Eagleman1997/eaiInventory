package eaiproject.eaiprojectInventory.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import eaiproject.eaiprojectInventory.data.domain.Inventory;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Integer>{

	public List<Inventory> findInventoriesByTrackingId(@Param("inventory_id") Integer InventoryId);
	public List<Inventory> findInventoriesByOrderId(@Param("OrderId") Integer OrderId);
}
