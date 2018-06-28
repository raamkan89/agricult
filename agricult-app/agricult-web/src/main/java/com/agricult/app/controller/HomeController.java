package com.agricult.app.controller;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.agricult.app.service.HomeService;

@Controller
public class HomeController {

	@Autowired
	private HomeService homeService;

	@RequestMapping("/")
	public String home() {
		return "home";
	}

	@PostConstruct
	private void getFruitProducts() {
		System.out.println("-----------PostContruct-----------");
		homeService.copyImagesAndUpdatePath();
	}

}
