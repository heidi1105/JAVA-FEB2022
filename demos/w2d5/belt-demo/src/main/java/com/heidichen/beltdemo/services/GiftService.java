package com.heidichen.beltdemo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.heidichen.beltdemo.models.Gift;
import com.heidichen.beltdemo.repositories.GiftRepository;

@Service
public class GiftService {

	@Autowired
	private GiftRepository giftRepo;
	
	//get all
	public List<Gift> allGifts(){
		return giftRepo.findAll();
	}
	
	
	// get one
	public Gift oneGift(Long giftId) {
		Optional<Gift> optionalGift = giftRepo.findById(giftId);
		if(optionalGift.isPresent()) {
			return optionalGift.get();
		}else {
			return null;
		}
	}
	
	
	// create
	public Gift createGift(Gift gift) {
		return giftRepo.save(gift);
	}
	
	// update
	public Gift updateGift(Gift gift) {
		return giftRepo.save(gift);
	}
	
	// delete
	public void deleteGift(Long id) {
		giftRepo.deleteById(id);
	}
	
}
