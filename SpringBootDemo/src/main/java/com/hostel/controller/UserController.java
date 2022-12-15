package com.hostel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hostel.model.User;
import com.hostel.repo.UserRepository;
import com.hostel.service.UserService;


@RestController
@CrossOrigin(origins="http://localhost:4200")

public class UserController {
	
	@Autowired
	UserRepository userRepo;
	
	@Autowired
	UserService service;
	
	
	@PostMapping("/save")
	public User userRegister(@RequestBody User user) throws Exception{
		String tempEmail=user.getEmail();
		if(tempEmail!=null && !"".equals(tempEmail)) {
			User userobj=service.fetchingEmail(tempEmail);
			if(userobj!=null) {
				throw new Exception("user with"+tempEmail+"is already exist");
		}
	}
		User userobj=null;
		
		 userobj= userRepo.save(user);
		 return userobj;
		 
		
	}
	@GetMapping("/users")
   public List<User> getAllStudent(){
	   return userRepo.findAll();
   }
	
//	@PostMapping("/login")
//	public ResponseEntity<?> login(@RequestBody User users)  {
//	   
//	   
//		  User user=userRepo.findById(users.getId());
//	   if(user.getPassword().equals(users.getPassword()) && user.getEmail().equals(users.getEmail())) {
//		   return ResponseEntity.ok(user);
//	  }
//	   
//		
//		return (ResponseEntity<?>) ResponseEntity.internalServerError();
//	}
	
	@PostMapping("/login")
	public User login(@RequestBody User users) throws Exception{
	
	String tempEmail=users.getEmail();
		String tempass=users.getPassword();
		User userObj=null;
		
		if(tempEmail!=null && tempass!=null ) {
		 userObj=service.fetchEmailAndPass(tempEmail, tempass);
			
		}
		if(userObj==null) {
			throw new Exception("Bad credentials");
		}
		return userObj;
	}
//	public String UserLogin(@ModelAttribute("user") User user) {
//		int useId=user.getId();
//		
//	 User userdata=this.userRepo.findById(user);
//	 if(user.getUserName().equals(userdata.getUserName())) {
//		 return "ok";
//	 }
//	 else {
//		 return "error";
//	 }
		
		
		
			
			
		
		
	}

