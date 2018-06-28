package com.agricult.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.agricult.app.dao.entities.User;
import com.agricult.app.service.SignUpService;
import com.agricult.app.utility.AgricultUtility;
import com.agricult.app.utility.Occupation;

@RestController
public class SignUpController {

	@Autowired
	SignUpService signUpService;
	

	@PostMapping("signup")
	public void signup(@RequestBody(required = true) User user) {
		String userId = AgricultUtility.generateUserId(Occupation.valueOf(user.getOccupationType()));
		user.setUserId(userId);
		signUpService.signUpDetails(user);
	}

	@PostMapping("confirm-register")
	public void confirmRegister(@RequestBody(required = true) User user) {
		if(user.getPassword().equals(user.getConfirmPassword())) {
			signUpService.confirmRegister(user.getDob(), user.getUserId(), user.getPassword());
		}
	}
	
	
	
	@GetMapping("getUserId/{firstname}/{dob}")
	public User getUserId(@PathVariable("firstname") String firstName,@PathVariable("dob") String dob) {
		return signUpService.userIdDetails(firstName, dob);
	}
}
