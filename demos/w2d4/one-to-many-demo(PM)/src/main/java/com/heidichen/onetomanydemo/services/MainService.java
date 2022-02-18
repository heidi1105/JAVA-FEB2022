package com.heidichen.onetomanydemo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.heidichen.onetomanydemo.models.Gift;
import com.heidichen.onetomanydemo.models.User;
import com.heidichen.onetomanydemo.repositories.GiftRepository;
import com.heidichen.onetomanydemo.repositories.UserRepository;

@Service
public class MainService {
	
	//OPTION 1
//	private final UserRepository userRepo;
//	private final GiftRepository giftRepo;
//	
//	public MainService(UserRepository userRepo, GiftRepository giftRepo) {
//		this.userRepo= userRepo;
//		this.giftRepo = giftRepo;
//	}
	
	// OPTION 2
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private GiftRepository giftRepo;
	
	// create users
	public User saveUser(User user) {
		return userRepo.save(user);
	}
	
	
	// create gifts
	public Gift saveGift(Gift gift) {
		return giftRepo.save(gift);
	}
	
	
	// find all users
	public List<User> allUsers(){
		return userRepo.findAll();
	}
	
	// find all gifts
	public List<Gift> allGifts(){
		return giftRepo.findAll();
	}
	
	// find one user
	public User oneUser(Long userId) {
		Optional<User> optionalUser = userRepo.findById(userId);
		if(optionalUser.isPresent()) {
			return optionalUser.get();
		}else {
			return null;
		}
	}
	
	
	

}
