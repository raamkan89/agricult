package com.agricult.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.agricult.app.dao.entities.Categories;
import com.agricult.app.dao.entities.User;
import com.agricult.app.service.HomeService;
import com.agricult.app.service.LoginService;

@RestController
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@Autowired
	private HomeService homeService;
	
	@PostMapping("login")
	public void login(@RequestBody(required = true) User user) {
		boolean success = loginService.login(user.getUserId(), user.getPassword());
		System.out.println("--Success--" + success);
	}
	
	@GetMapping("categories")
	public List<Categories> getCategories() {
		List<Categories> categories = homeService.getCategories();
		return categories;
		
	}

}
