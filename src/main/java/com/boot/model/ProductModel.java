package com.boot.model;

public class ProductModel {
private String productId;
private String productName;
public String getProductId() {
	return productId;
}
public void setProductId(String productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public ProductModel(String productId, String productName) {
	super();
	this.productId = productId;
	this.productName = productName;
}
public ProductModel() {
	// TODO Auto-generated constructor stub
}

}
