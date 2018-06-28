package com.agricult.app.service;

import java.util.List;

import com.agricult.app.dao.entities.Categories;

public interface HomeService {

	public List<Categories> getCategories();
	
	public void copyImagesAndUpdatePath();
	 
}
