package com.agricult.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.agricult.app.dao.entities.VegetableProducts;

public interface VegetableProductRepository extends MongoRepository<VegetableProducts, String> {

}
