package com.agricult.app.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.agricult.app.dao.FruitProductDao;
import com.agricult.app.dao.entities.FruitProducts;
import com.agricult.app.repository.FruitProductRepository;

@Repository
public class FruitProductDaoImpl implements FruitProductDao {

	@Autowired
	private FruitProductRepository fruitProductRepository;

	@Override
	public List<FruitProducts> getFruitProducts() {
		List<FruitProducts> fruitProducts = fruitProductRepository.findAll();
		return fruitProducts;
	}
}
