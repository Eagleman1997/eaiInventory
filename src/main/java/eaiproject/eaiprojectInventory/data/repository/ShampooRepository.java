package eaiproject.eaiprojectInventory.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import eaiproject.eaiprojectInventory.data.domain.Shampoo;

/**
 * For searching the shampoo in de DB
 * @param shampooId
 * @author Lukas Weber
 */
@Repository
public interface ShampooRepository extends JpaRepository<Shampoo, Integer>{

	public List<Shampoo> findShampoosByShampooId(@Param("shampooId") Integer ShampooId);
}
