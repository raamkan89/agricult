package com.agricult.app.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agricult.app.dao.VegetableProductDao;
import com.agricult.app.dao.entities.VegetableProducts;
import com.agricult.app.service.VegetableProductService;

@Service
public class VegetableProductServiceImpl implements VegetableProductService {

	@Autowired
	private VegetableProductDao vegetableProductDao;

	public List<VegetableProducts> getVegetableProducts() {
		List<VegetableProducts> vegetableProducts = vegetableProductDao.getVegetableProducts();
		return vegetableProducts;
	}
}
