package com.hostel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.hostel.model.User;
import com.hostel.repo.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepo;
	
//	public User registerSave(@RequestBody User user) {
//		return userRepo.save(null);
//	}
	
	public User fetchingEmail(String email) {
		return userRepo.findByEmail(email);
	}
  
//	 public List<User> getAllStudent(){
//		   return userRepo.findAll();
//	   }
	public User fetchEmailAndPass(String email,String password) {
		return userRepo.findByEmailAndPassword(email, password);
	}

}
