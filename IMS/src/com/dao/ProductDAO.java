package com.dao;

import java.sql.SQLException;
import java.util.List;
import com.exception.ProductNotFoundException;
import com.model.Product;

public interface ProductDAO {
	public String addProduct(Product product) throws SQLException,ClassNotFoundException;
	public Product readProduct(int productId)throws SQLException,ClassNotFoundException;
	public String deleteProduct(int productId)throws SQLException,ClassNotFoundException,ProductNotFoundException;
	public String updateProduct(Product product) throws SQLException,ClassNotFoundException,ProductNotFoundException;
	public List<Product> listAllProducts()throws SQLException,ClassNotFoundException;

}
