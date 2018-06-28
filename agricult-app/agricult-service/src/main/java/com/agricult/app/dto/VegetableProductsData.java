package com.agricult.app.dto;

public class VegetableProductsData {

	private int vegetableId;
	private String productName;
	private int categoryId;
	private String categoryName;

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

}
