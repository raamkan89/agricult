package com.agricult.app.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agricult.app.dao.CropProductDao;
import com.agricult.app.dao.entities.CropProducts;
import com.agricult.app.service.CropProductService;

@Service
public class CropProductServiceImpl implements CropProductService {

	@Autowired
	private CropProductDao cropProductDao;

	@Override
	public List<CropProducts> getCropProducts() {
		List<CropProducts> cropProducts = cropProductDao.getCropProducts();
		return cropProducts;
	}

}
