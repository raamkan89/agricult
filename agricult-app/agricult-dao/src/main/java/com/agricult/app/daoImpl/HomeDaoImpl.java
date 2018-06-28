package com.agricult.app.daoImpl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.gridfs.GridFsOperations;
import org.springframework.data.mongodb.gridfs.GridFsResource;
import org.springframework.stereotype.Repository;

import com.agricult.app.dao.HomeDao;
import com.agricult.app.dao.entities.Categories;
import com.agricult.app.dao.entities.FruitProducts;
import com.agricult.app.repository.HomeRepository;

@Repository
public class HomeDaoImpl implements HomeDao {
	
	@Autowired
	HomeRepository homeRepository;

	@Autowired
	private GridFsOperations gridFsOperations;

	private OutputStream outputStream;
	
	@Override
	public List<Categories> getCategories() {
		List<Categories> categories = homeRepository.findAll();
		return categories;
	}

	@Override
	public void copyImages() {
		GridFsResource[] gridFsResources = gridFsOperations.getResources("*.jpg");
		for (GridFsResource gridFsResource : gridFsResources) {
			try {
				InputStream inputStream = gridFsResource.getInputStream();
				outputStream = new FileOutputStream(
						new File("src/main/resources/static/img/" + gridFsResource.getFilename()));
				int read = 0;
				byte[] bytes = new byte[80000];
				while ((read = inputStream.read(bytes)) != -1) {
					outputStream.write(bytes, 0, read);
				}
			} catch (IOException io) {
				System.out.println(io.getStackTrace());
			}
		}
	}
}
