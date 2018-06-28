package com.agricult.app.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agricult.app.dao.FruitProductDao;
import com.agricult.app.dao.entities.FruitProducts;
import com.agricult.app.service.FruitProductService;

@Service
public class FruitProductServiceImpl implements FruitProductService {

	@Autowired
	private FruitProductDao fruitProductDao;

	public List<FruitProducts> getFruitProducts() {
		List<FruitProducts> fruitProducts = fruitProductDao.getFruitProducts();
		return fruitProducts;
	}
}
