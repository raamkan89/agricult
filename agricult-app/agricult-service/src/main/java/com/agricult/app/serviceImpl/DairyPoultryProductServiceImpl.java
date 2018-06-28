package com.agricult.app.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agricult.app.dao.DairyPoultryProductDao;
import com.agricult.app.dao.entities.DairyAndPoultry;
import com.agricult.app.service.DairyPoultryProductService;

@Service
public class DairyPoultryProductServiceImpl implements DairyPoultryProductService {

	@Autowired
	private DairyPoultryProductDao dairyPoultryProductDao;

	@Override
	public List<DairyAndPoultry> getDairyPoultryProducts() {
		List<DairyAndPoultry> dairyAndPoultries = dairyPoultryProductDao.getDairyPoultryProducts();
		return dairyAndPoultries;
	}

}
