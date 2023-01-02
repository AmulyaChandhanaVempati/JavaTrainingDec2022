package com.ims.service;

import java.sql.SQLException;
import java.util.List;

import com.ims.exception.InvalidProductNameException;
import com.ims.exception.ProductNotFoundException;
import com.ims.model.Product;

public interface ProductService {
	public String addProduct(Product product) throws SQLException,ClassNotFoundException,InvalidProductNameException;
	public boolean updateAllProductsByExpiryDate(List<Product> productList) throws SQLException,ClassNotFoundException;
	public boolean updateProductById(Product product) throws SQLException,ClassNotFoundException,ProductNotFoundException;
	public boolean deleteProductbyExpiryDate(List<Product> productList) throws SQLException,ClassNotFoundException,ProductNotFoundException;
	public boolean deleteProductById(Integer productId) throws SQLException,ClassNotFoundException,ProductNotFoundException;
	public List<Product> listAllProducts() throws SQLException,ClassNotFoundException;
	public boolean applyDiscount(List<Product> productList) throws SQLException,ClassNotFoundException;
	

}
