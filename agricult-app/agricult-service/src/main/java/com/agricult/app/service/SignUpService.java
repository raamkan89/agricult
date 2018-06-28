package com.agricult.app.service;

import com.agricult.app.dao.entities.User;

public interface SignUpService {

	public User signUpDetails(User userDetails);
	
	public User userIdDetails(String firstName,String dob);
	
	public User confirmRegister(String dob, String userId, String password);
	
}
