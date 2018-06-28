package com.agricult.app.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.agricult.app.dao.VegetableProductDao;
import com.agricult.app.dao.entities.VegetableProducts;
import com.agricult.app.repository.VegetableProductRepository;

@Repository
public class VegetableProductDaoImpl implements VegetableProductDao {

	@Autowired
	private VegetableProductRepository vegetableProductRepository;

	@Override
	public List<VegetableProducts> getVegetableProducts() {
		List<VegetableProducts> vegetableProducts = vegetableProductRepository.findAll();
		return vegetableProducts;
	}

}
