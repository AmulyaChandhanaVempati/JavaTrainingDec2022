package com.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.ProductDAO;
import com.dao.ProductDAOImpl;
import com.exception.ProductNotFoundException;
import com.model.Product;

public class ProductServiceImpl implements ProductService{
	
	public boolean addProduct(Product product) throws SQLException, ClassNotFoundException {
		ProductDAO pd = new ProductDAOImpl();
		String result = pd.addProduct(product);
		if(result=="success") {
			return true;
		}
		return false;
	}

	
	public Product readProduct(int productId) throws SQLException, ClassNotFoundException {
		ProductDAO pd = new ProductDAOImpl();
		Product p = pd.readProduct(productId);
		return p;
	}


	public boolean deleteProduct(int productId) throws ProductNotFoundException, ClassNotFoundException, SQLException {
		ProductDAO pd = new ProductDAOImpl();
		String result;
		result = pd.deleteProduct(productId);
		if(result=="success") {
			return true;
		}
		return false;
	}


	public boolean updateProduct(Product product)
			throws SQLException, ClassNotFoundException, ProductNotFoundException {
		ProductDAO pd = new ProductDAOImpl();
		String result = pd.updateProduct(product);
		if(result=="success") {
			return true;
		}
		return false;
	}


	@Override
	public List<Product> listAllProducts() throws SQLException, ClassNotFoundException {
		List<Product> plist=new ArrayList<>();
		ProductDAO pd=new ProductDAOImpl();
		plist=pd.listAllProducts();
		return plist;
	}

}
