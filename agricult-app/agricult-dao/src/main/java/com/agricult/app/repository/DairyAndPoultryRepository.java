package com.agricult.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.agricult.app.dao.entities.DairyAndPoultry;

public interface DairyAndPoultryRepository extends MongoRepository<DairyAndPoultry, String> {

}
