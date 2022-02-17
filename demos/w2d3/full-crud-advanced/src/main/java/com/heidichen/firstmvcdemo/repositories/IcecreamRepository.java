package com.heidichen.firstmvcdemo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.heidichen.firstmvcdemo.models.Icecream;

public interface IcecreamRepository extends CrudRepository<Icecream, Long> {
	
	List<Icecream> findAll();
	
	// exact match
	List<Icecream> findByFlavor(String keyword);
	
	List<Icecream> findByFlavorContaining(String keyword);
	
	List<Icecream> findAllByOrderByPriceDesc();
	
	List<Icecream> findAllByOrderByFlavor();
	
	List<Icecream> findTop5ByOrderByPriceDesc();

	@Query(value="SELECT * FROM icecreams", nativeQuery=true)
	List<Icecream> whateverICall();
	
	
}
