package com.agricult.app.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.agricult.app.dao.DairyPoultryProductDao;
import com.agricult.app.dao.entities.DairyAndPoultry;
import com.agricult.app.repository.DairyAndPoultryRepository;

@Repository
public class DairyPoultryProductDaoImpl implements DairyPoultryProductDao {

	@Autowired
	private DairyAndPoultryRepository dairyAndPoultryRepository;

	@Override
	public List<DairyAndPoultry> getDairyPoultryProducts() {
		List<DairyAndPoultry> dairyAndPoultries = dairyAndPoultryRepository.findAll();
		return dairyAndPoultries;
	}

}
