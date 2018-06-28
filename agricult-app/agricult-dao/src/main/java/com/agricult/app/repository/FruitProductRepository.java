package com.agricult.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.agricult.app.dao.entities.FruitProducts;

public interface FruitProductRepository extends MongoRepository<FruitProducts, String> {

	public FruitProducts findByImageFileName(String imageFileName);
	
}
