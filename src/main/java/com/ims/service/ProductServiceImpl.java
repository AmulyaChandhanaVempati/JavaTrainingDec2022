package com.ims.service;

import java.sql.SQLException;
import java.util.List;
import com.ims.dao.ProductDAO;
import com.ims.dao.ProductDAOImpl;
import com.ims.exception.InvalidProductNameException;
import com.ims.exception.ProductNotFoundException;
import com.ims.model.Product;

public class ProductServiceImpl implements ProductService {

	@Override
	public String addProduct(Product product) throws SQLException, ClassNotFoundException, InvalidProductNameException {
		ProductDAO eDAO = new ProductDAOImpl();
		if(eDAO.addProduct(product)=="success") {
			return "success";
		}
		return eDAO.addProduct(product);
	}

	@Override
	public boolean updateAllProductsByExpiryDate(List<Product> productList)
			throws SQLException, ClassNotFoundException {
		ProductDAO pd = new ProductDAOImpl();
		if(pd.updateAllProductsByExpiryDate(productList)=="success") {
			return true;
		}
		return false;
		
	}

	@Override
	public boolean updateProductById(Product product)
			throws SQLException, ClassNotFoundException, ProductNotFoundException {
		ProductDAO pd = new ProductDAOImpl();
		if(pd.updateProductById(product)=="success") {
			return true;
		}
		return false;
		
	}

	@Override
	public boolean deleteProductbyExpiryDate(List<Product> productList)
			throws SQLException, ClassNotFoundException, ProductNotFoundException {
		ProductDAO pd = new ProductDAOImpl();
		if(pd.deleteProductbyExpiryDate(productList)=="success") {
			return true;
		}
		return false;
		
	}

	@Override
	public boolean deleteProductById(Integer productId)
			throws SQLException, ClassNotFoundException, ProductNotFoundException {
		ProductDAO pd = new ProductDAOImpl();
		if(pd.deleteProductById(productId)=="success") {
			return true;
		}
		return false;
		
	}

	@Override
	public List<Product> listAllProducts() throws SQLException, ClassNotFoundException {
		ProductDAO pd = new ProductDAOImpl();
		return pd.listAllProducts();
		
	}

	@Override
	public boolean applyDiscount(List<Product> productList) throws SQLException, ClassNotFoundException {
		ProductDAO pd = new ProductDAOImpl();
		if(pd.applyDiscount(productList) =="success") {
			return true;
		}
		return false;
	}

}
