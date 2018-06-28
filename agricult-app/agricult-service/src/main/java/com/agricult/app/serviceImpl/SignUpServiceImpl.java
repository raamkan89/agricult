package com.agricult.app.serviceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agricult.app.dao.SignUpDao;
import com.agricult.app.dao.entities.User;
import com.agricult.app.service.SignUpService;

@Service
public class SignUpServiceImpl implements SignUpService{

	@Autowired
	private SignUpDao signUpDao;
	
	@Override
	public User signUpDetails(User userDetails) {
		System.out.println("Inside signup ServiceImpl class ---------- signUpDetails --------------- ");
		return signUpDao.signUpDetails(userDetails);
	}

	@Override
	public User userIdDetails(String firstName,String dob) {
		System.out.println("Inside signup ServiceImpl class ---------- userIdDetails --------------- ");
		User user = signUpDao.userIdDetails(firstName,dob);
		return user;
	}

	@Override
	public User confirmRegister(String dob, String userId, String password) {
		System.out.println("Inside signup ServiceImpl class ---------- confirmRegister --------------- ");
		User user = signUpDao.confirmRegister(dob, userId, password);
		return user;
	}
	
	

}
