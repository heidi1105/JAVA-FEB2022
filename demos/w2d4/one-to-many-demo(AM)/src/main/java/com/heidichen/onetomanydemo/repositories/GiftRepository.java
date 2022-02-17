package com.heidichen.onetomanydemo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.heidichen.onetomanydemo.models.Gift;

@Repository
public interface GiftRepository extends CrudRepository<Gift, Long> {
	List<Gift> findAll();

}
