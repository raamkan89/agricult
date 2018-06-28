package com.agricult.app.dao;

import com.agricult.app.dao.entities.User;

public interface SignUpDao {
	
	public User signUpDetails(User userDetails);
	
	public User userIdDetails(String firstName,String dob);
	
	public User confirmRegister(String dob, String userId, String password);

}
