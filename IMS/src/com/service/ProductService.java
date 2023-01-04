package com.service;

import java.sql.SQLException;
import java.util.List;

import com.exception.ProductNotFoundException;
import com.model.Product;

public interface ProductService {
	public boolean addProduct(Product product) throws SQLException,ClassNotFoundException;
	public Product readProduct(int productId)throws SQLException,ClassNotFoundException;
	public boolean deleteProduct(int productId)throws SQLException,ClassNotFoundException,ProductNotFoundException;
	public boolean updateProduct(Product product) throws SQLException,ClassNotFoundException,ProductNotFoundException;
	public List<Product> listAllProducts()throws SQLException,ClassNotFoundException;

}
