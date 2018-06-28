package com.agricult.app.dao;

import java.util.List;

import com.agricult.app.dao.entities.Categories;

public interface HomeDao {

	public List<Categories> getCategories();
	
	public void copyImages();
	
}
