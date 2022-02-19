package com.heidichen.beltreview.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.heidichen.beltreview.models.LoginUser;
import com.heidichen.beltreview.models.User;
import com.heidichen.beltreview.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepo;

	public User register(User newUser, BindingResult result) {
		// check email uniqueness (if present, reject)
		if (userRepo.findByEmail(newUser.getEmail()).isPresent()) {
			result.rejectValue("email", "Unique", "This email is already in use!");
		}

		// check password and confirm (match!)
		if (!newUser.getPassword().equals(newUser.getConfirm())) { // Check password & confirm are the same
			result.rejectValue("confirm", "Matches", "The confirmed password does not match.");
		}

		// check if result has errors
		if (result.hasErrors()) {
			return null;
		} else {
			String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt()); // hash with new salt
			newUser.setPassword(hashed);
			return userRepo.save(newUser);
		}
		// hash with the new salt
	}

	public User login(LoginUser newLogin, BindingResult result) {
		// 1. grab the potential user to see if the email exists (not exist --> reject)
		Optional<User> potentialUser = userRepo.findByEmail(newLogin.getEmail());
		if (!potentialUser.isPresent()) { // no such user
			result.rejectValue("email", "Unqiue", "Unknown Email");
			return null;
		}

		// 2. grab the user and check the pw by BCrypt
		User user = potentialUser.get();
		if (!BCrypt.checkpw(newLogin.getPassword(), user.getPassword())) {
			result.rejectValue("password", "Matches", "Invalid password.");
		}
		if (result.hasErrors()) {
			return null;
		} else {
			return user;
		}
	}

	public User findOneUser(Long id) {
		Optional<User> optionalUser = userRepo.findById(id);
		if (optionalUser.isPresent()) {
			return optionalUser.get();
		} else {
			return null;
		}
	}

}
