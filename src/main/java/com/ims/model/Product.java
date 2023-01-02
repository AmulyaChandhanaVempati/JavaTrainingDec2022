package com.ims.model;

import java.time.LocalDate;
import java.util.Objects;

public class Product {
	private Integer productId;
	private String productName;
	private LocalDate productManufacturingDate;
	private Integer useBeforeMonths;
	private LocalDate productExpDate;
	private double price;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(Integer productId, String productName, LocalDate productManufacturingDate, Integer useBeforeMonths,
			LocalDate productExpDate, double price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productManufacturingDate = productManufacturingDate;
		this.useBeforeMonths = useBeforeMonths;
		this.productExpDate = productExpDate;
		this.price = price;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public LocalDate getProductManufacturingDate() {
		return productManufacturingDate;
	}
	public void setProductManufacturingDate(LocalDate productManufacturingDate) {
		this.productManufacturingDate = productManufacturingDate;
	}
	public Integer getUseBeforeMonths() {
		return useBeforeMonths;
	}
	public void setUseBeforeMonths(Integer useBeforeMonths) {
		this.useBeforeMonths = useBeforeMonths;
	}
	public LocalDate getProductExpDate() {
		return productExpDate;
	}
	public void setProductExpDate(LocalDate productExpDate) {
		this.productExpDate = productExpDate;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productManufacturingDate="
				+ productManufacturingDate + ", useBeforeMonths=" + useBeforeMonths + ", productExpDate="
				+ productExpDate + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(price, productExpDate, productId, productManufacturingDate, productName, useBeforeMonths);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(productExpDate, other.productExpDate) && Objects.equals(productId, other.productId)
				&& Objects.equals(productManufacturingDate, other.productManufacturingDate)
				&& Objects.equals(productName, other.productName)
				&& Objects.equals(useBeforeMonths, other.useBeforeMonths);
	}
	
}
