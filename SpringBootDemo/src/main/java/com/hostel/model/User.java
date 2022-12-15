package com.hostel.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
  
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private int id;
  private String userName;
  private String  email;
  private String  name;
  private String phone;
  private String  password;
 
  
  

  public User() {
	super();
	// TODO Auto-generated constructor stub
}



public User(int id, String userName, String email, String name, String phone, String password) {
	super();
	this.id = id;
	this.userName = userName;
	this.email = email;
	this.name = name;
	this.phone = phone;
	this.password = password;
	
}



public int getId() {
	return id;
}



public void setId(int id) {
	this.id = id;
}



public String getUserName() {
	return userName;
}



public void setUserName(String userName) {
	this.userName = userName;
}



public String getEmail() {
	return email;
}



public void setEmail(String email) {
	this.email = email;
}



public String getName() {
	return name;
}



public void setName(String name) {
	this.name = name;
}



public String getPhone() {
	return phone;
}



public void setPhone(String phone) {
	this.phone = phone;
}



public String getPassword() {
	return password;
}



public void setPassword(String password) {
	this.password = password;
}



@Override
public String toString() {
	return "User [id=" + id + ", userName=" + userName + ", email=" + email + ", name=" + name + ", phone=" + phone
			+ ", password=" + password + "]";
}






}