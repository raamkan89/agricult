package com.agricult.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.agricult.app.dao.entities.CropProducts;

public interface CropProductRepository extends MongoRepository<CropProducts, String> {

}
