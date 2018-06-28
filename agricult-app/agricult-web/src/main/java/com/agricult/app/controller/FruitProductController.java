package com.agricult.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agricult.app.dao.entities.FruitProducts;
import com.agricult.app.service.FruitProductService;

@RestController
public class FruitProductController {

	@Autowired
	private FruitProductService fruitProductService;

	@GetMapping("/getFruitProducts")
	private List<FruitProducts> getFruitProducts() {
		List<FruitProducts> fruitProducts = fruitProductService.getFruitProducts();
		return fruitProducts;
	}
}
