package com.agricult.app.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.agricult.app.dao.CropProductDao;
import com.agricult.app.dao.entities.CropProducts;
import com.agricult.app.repository.CropProductRepository;

@Repository
public class CropProductDaoImpl implements CropProductDao {

	@Autowired
	private CropProductRepository cropProductRepository; 
	
	@Override
	public List<CropProducts> getCropProducts() {
		List<CropProducts> cropProducts = cropProductRepository.findAll();
		return cropProducts;
	}

}
