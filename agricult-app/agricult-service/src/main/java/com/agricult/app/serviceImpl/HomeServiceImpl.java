package com.agricult.app.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agricult.app.dao.HomeDao;
import com.agricult.app.dao.entities.Categories;
import com.agricult.app.dao.entities.FruitProducts;
import com.agricult.app.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService {

	@Autowired
	private HomeDao homeDao;
	
	@Override
	public List<Categories> getCategories() {
		List<Categories> categories = homeDao.getCategories();
		return categories;
	}

	@Override
	public void copyImagesAndUpdatePath() {
		homeDao.copyImages();
	}

}
