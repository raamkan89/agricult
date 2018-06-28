package com.agricult.app.dto;

public class FarmersRequestData {

	private int requestId;

	private int categoryId;

	private String categoryName;

	private int productId;

	private int productName;

	private String type;

	private String quantity;

	private String quality;

	private int requestedPrice;

	private int ApprovedPrice;

	private String status;

	public int getRequestId() {
		return requestId;
	}

	public void setRequestId(int requestId) {
		this.requestId = requestId;
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

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getProductName() {
		return productName;
	}

	public void setProductName(int productName) {
		this.productName = productName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	public int getRequestedPrice() {
		return requestedPrice;
	}

	public void setRequestedPrice(int requestedPrice) {
		this.requestedPrice = requestedPrice;
	}

	public int getApprovedPrice() {
		return ApprovedPrice;
	}

	public void setApprovedPrice(int approvedPrice) {
		ApprovedPrice = approvedPrice;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
