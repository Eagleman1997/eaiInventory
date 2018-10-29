package eaiproject.eaiprojectInventory.business.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import eaiproject.eaiprojectInventory.data.domain.Inventory;
import eaiproject.eaiprojectInventory.data.domain.Shampoo;
import eaiproject.eaiprojectInventory.data.repository.InventoryRepository;
import eaiproject.eaiprojectInventory.data.repository.ShampooRepository;

public class InventoryService {
	
	@Autowired
	private InventoryRepository inventoryRepository;
	private ShampooRepository shampooRespository;
	
	/**
	 * Invenvory
	 */
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
	
	/**
	 * Shampoo
	 */
	public Shampoo createShampoo(Integer shampoo_id, String name, String brand, String type, Double price) {
		Shampoo shampoo = new Shampoo(shampoo_id, name, brand, type, price);
		return shampooRespository.save(shampoo);
	}
	
	public List<Shampoo> readShampooById(String shampooId) {
		return shampooRespository.findShampoosByShampooId(Integer.parseInt(shampooId));
	}
	
	public Shampoo updateShampoo(String shampoo_id, String name, String brand, String type, Double price) {
		Shampoo shampoo = new Shampoo(Integer.parseInt(shampoo_id), name , brand, type, price);
		shampoo.setShampoo_id(Integer.parseInt(shampoo_id));
		return shampooRespository.save(shampoo);
	}
	

}
