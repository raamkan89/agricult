package com.agricult.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.agricult.app.dao.entities.User;

public interface SignUpLoginRepository extends MongoRepository<User, String> {
	
	public User findByFirstNameAndDob(String firstName, String dob);
	
	public User findByUserIdAndPassword(String username,String password);
}
