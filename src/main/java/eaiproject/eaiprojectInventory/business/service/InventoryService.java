package eaiproject.eaiprojectInventory.business.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import eaiproject.eaiprojectInventory.data.domain.Inventory;
import eaiproject.eaiprojectInventory.data.repository.InventoryRepository;

public class InventoryService {
	
	@Autowired
	private InventoryRepository inventoryRepository;
	
	public Inventory createInventory(Integer inventory_id, Integer shampoo_id, Integer amount_of_stock, String location) {
		Inventory inventory = new Inventory(inventory_id, shampoo_id, amount_of_stock, location);
		return inventoryRepository.save(inventory);
	}
	
	public Inventory readInventoryById(String inventoryId) {
		return inventoryRepository.findById(Integer.parseInt(inventoryId)).orElse(null);
	}
	
	public Inventory updateInventory(String inventory_id, Integer shampoo_id, Integer amount_of_stock, String location) {
		Inventory inventory = new Inventory(Integer.parseInt(inventory_id), shampoo_id, amount_of_stock, location);
		inventory.setInventory_id(Integer.parseInt(inventory_id));
		return inventoryRepository.save(inventory);
	}

}
