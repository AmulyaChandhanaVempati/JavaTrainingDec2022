package com.pms.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.pms.dao.ProductDAO;
import com.pms.dao.ProductDAOImpl;
import com.pms.model.Product;

public class ProductServiceImpl implements ProductService {
	
	ProductDAO pDao;
	public ProductServiceImpl() {
		
	}

	@Override
	public String addProduct(Product product) throws SQLException, ClassNotFoundException {
		pDao=new ProductDAOImpl();
		   String result=pDao.addProduct(product);
			return result;
	}

	@Override
	public List<Product> listAllProducts() throws SQLException, ClassNotFoundException {
		List<Product> plist=new ArrayList<>();
		pDao=new ProductDAOImpl();
		plist=pDao.listAllProducts();
		return plist;
	}

	@Override
	public String deleteProduct(int productId) throws SQLException, ClassNotFoundException {
		pDao=new ProductDAOImpl();
		String result = pDao.deleteProduct(productId);
		return result;
	}

	@Override
	public String update(Product product) throws SQLException, ClassNotFoundException {
		pDao=new ProductDAOImpl();
		String result = pDao.update(product);
		return result;
	}

}
