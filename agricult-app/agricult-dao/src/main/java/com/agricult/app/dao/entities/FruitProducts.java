package com.agricult.app.dao.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "fruitproducts")
public class FruitProducts {

	@Id
	private int fruitId;

	private String productName;

	private int categoryId;

	private String categoryName;

	private String imageFileName;

	private String imageFilePath;

	public int getFruitId() {
		return fruitId;
	}

	public void setFruitId(int fruitId) {
		this.fruitId = fruitId;
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

	@Override
	public String toString() {
		return "FruitProducts [fruitId=" + fruitId + ", productName=" + productName + ", categoryId=" + categoryId
				+ ", categoryName=" + categoryName + ", imageFileName=" + imageFileName + ", imageFilePath="
				+ imageFilePath + "]";
	}

	
}
