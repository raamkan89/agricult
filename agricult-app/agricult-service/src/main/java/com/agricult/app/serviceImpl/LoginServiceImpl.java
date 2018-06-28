package com.agricult.app.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agricult.app.dao.LoginDao;
import com.agricult.app.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginDao loginDao;
	
	@Override
	public boolean login(String username, String password) {
	 boolean success = loginDao.login(username, password);
	 return success;
	}

}
