package eaiproject.eaiprojectInventory.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import eaiproject.eaiprojectInventory.data.domain.Inventory;

/**
 * For searching the inventory in de DB
 * @param inventoryId
 * @author Lukas Weber
 */
@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Integer>{

	public List<Inventory> findInventoryByInventoryId(@Param("inventoryId") Integer InventoryId);
}
