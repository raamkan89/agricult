package com.agricult.app.dao.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "vegetableproducts")
public class VegetableProducts {

	@Id
	private int vegetableId;
	
	private String productName;
	
	private int categoryId;
	
	private String categoryName;
	
	private String imageFileName;

	private String imageFilePath;

	public int getVegetableId() {
		return vegetableId;
	}

	public void setVegetableId(int vegetableId) {
		this.vegetableId = vegetableId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getImageFileName() {
		return imageFileName;
	}

	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}

	public String getImageFilePath() {
		return imageFilePath;
	}

	public void setImageFilePath(String imageFilePath) {
		this.imageFilePath = imageFilePath;
	}
	
	

}
