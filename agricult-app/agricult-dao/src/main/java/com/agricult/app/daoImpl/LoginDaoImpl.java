package com.agricult.app.daoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.agricult.app.dao.LoginDao;
import com.agricult.app.dao.entities.User;
import com.agricult.app.repository.SignUpLoginRepository;

@Repository
public class LoginDaoImpl implements LoginDao {

	@Autowired 
	public SignUpLoginRepository signUpLoginRepository;
	
	
	@Override
	public boolean login(String username, String password) {
		System.out.println("Inside LoginDaoImpl class login method");
		User user = signUpLoginRepository.findByUserIdAndPassword(username, password);
		if(user == null) {
			return false; 
		}
		return true;
	}

}
