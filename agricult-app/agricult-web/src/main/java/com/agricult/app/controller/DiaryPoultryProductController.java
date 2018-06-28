package com.agricult.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agricult.app.dao.entities.DairyAndPoultry;
import com.agricult.app.service.DairyPoultryProductService;

@RestController
public class DiaryPoultryProductController {

	@Autowired
	private DairyPoultryProductService dairyPoultryProductService;
	
	@GetMapping("/getDairyAndPoultryProducts")
	private List<DairyAndPoultry> getDairyAndPoultryProducts(){
		List<DairyAndPoultry> dairyAndPoultries = dairyPoultryProductService.getDairyPoultryProducts();
		return dairyAndPoultries;
	}
}
 