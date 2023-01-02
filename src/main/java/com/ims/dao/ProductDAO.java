package com.ims.dao;

import java.sql.SQLException;
import java.util.List;

import com.ims.exception.InvalidProductNameException;
import com.ims.exception.ProductNotFoundException;
import com.ims.model.Product;



public interface ProductDAO {
	public String addProduct(Product product) throws SQLException,ClassNotFoundException,InvalidProductNameException;
	public String updateAllProductsByExpiryDate(List<Product> productList) throws SQLException,ClassNotFoundException;
	public String updateProductById(Product product) throws SQLException,ClassNotFoundException,ProductNotFoundException;
	public String deleteProductbyExpiryDate(List<Product> productList) throws SQLException,ClassNotFoundException,ProductNotFoundException;
	public String deleteProductById(Integer productId) throws SQLException,ClassNotFoundException,ProductNotFoundException;
	public List<Product> listAllProducts() throws SQLException,ClassNotFoundException;
	public String applyDiscount(List<Product> productList) throws SQLException,ClassNotFoundException;
	

}
