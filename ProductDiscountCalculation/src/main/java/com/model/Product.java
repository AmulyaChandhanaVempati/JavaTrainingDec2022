package com.model;

import java.util.Objects;

public class Product {
	private int id;
	private String name;
	private double unitPrice;
	private double quanty;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int id, String name, double unitPrice, double quanty) {
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.quanty = quanty;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getQuanty() {
		return quanty;
	}

	public void setQuanty(double quanty) {
		this.quanty = quanty;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", unitPrice=" + unitPrice + ", quanty=" + quanty + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, quanty, unitPrice);
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
		return id == other.id && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(quanty) == Double.doubleToLongBits(other.quanty)
				&& Double.doubleToLongBits(unitPrice) == Double.doubleToLongBits(other.unitPrice);
	}

}
