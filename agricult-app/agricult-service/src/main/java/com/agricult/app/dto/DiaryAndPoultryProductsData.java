package com.agricult.app.dto;

public class DiaryAndPoultryProductsData {

	private int dairyId;
	private String productName;
	private int categoryId;
	private String categoryName;

	public int getDairyId() {
		return dairyId;
	}

	public void setDairyId(int dairyId) {
		this.dairyId = dairyId;
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
