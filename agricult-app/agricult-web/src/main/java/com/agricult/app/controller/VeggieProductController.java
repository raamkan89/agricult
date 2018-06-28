package com.agricult.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agricult.app.dao.entities.VegetableProducts;
import com.agricult.app.service.VegetableProductService;

@RestController
public class VeggieProductController {

	@Autowired
	private VegetableProductService vegetableProductService;

	@GetMapping("/getVegetableProducts")
	private List<VegetableProducts> getVegetableProducts() {
		List<VegetableProducts> vegetableProducts = vegetableProductService.getVegetableProducts();
		return vegetableProducts;
	}
}
