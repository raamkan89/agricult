package com.agricult.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agricult.app.dao.entities.CropProducts;
import com.agricult.app.service.CropProductService;

@RestController
public class CropProductController {

	@Autowired
	private CropProductService cropProductService;

	@GetMapping("/getCropProducts")
	private List<CropProducts> getCropProducts() {
		List<CropProducts> cropProducts = cropProductService.getCropProducts();
		return cropProducts;
	}

}
