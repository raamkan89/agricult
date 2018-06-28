package com.agricult.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.agricult.app.dao.entities.Categories;

public interface HomeRepository extends MongoRepository<Categories, String> {

	
}
