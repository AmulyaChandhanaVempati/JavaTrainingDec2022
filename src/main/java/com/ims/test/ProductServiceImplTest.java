package com.ims.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.ims.exception.InvalidProductNameException;
import com.ims.exception.ProductNotFoundException;
import com.ims.model.Product;
import com.ims.service.ProductService;
import com.ims.service.ProductServiceImpl;
 class ProductServiceImplTest {
	
   ProductService ps = new ProductServiceImpl();
	
	@Test
	public void updateAllProductsByExpiryDateValidation() throws ClassNotFoundException, SQLException {
		
		String string = "2022-04-12";
		LocalDate date = LocalDate.parse(string, DateTimeFormatter.ISO_DATE);
		Product p1 = new Product(171,"table",date,4,null,5000);
		Product p2 =new Product(112,"chair",date,6,null,8000);
		List<Product> plist = new ArrayList<Product>();
		plist.add(p1);
		plist.add(p2);
		assertTrue(ps.updateAllProductsByExpiryDate(plist));
	}
	
	@Test
	public void updateProductByIdValidation() throws ClassNotFoundException, SQLException, ProductNotFoundException {
		String string = "2022-04-12";
		LocalDate date = LocalDate.parse(string, DateTimeFormatter.ISO_DATE);
		Product p1 = new Product(151,"officeChair",date,4,null,5000);
		assertTrue(ps.updateProductById(p1));
	}
	
	@Test
	public void deleteProductbyExpiryDateValidation() throws ClassNotFoundException, SQLException, ProductNotFoundException {
		String string = "2022-04-12";
		LocalDate date = LocalDate.parse(string, DateTimeFormatter.ISO_DATE);
		Product p1 = new Product(111,"cheppal",date,4,null,5000);
		Product p2 =new Product(112,"table1",date,6,null,8000);
		List<Product> plist = new ArrayList<Product>();
		plist.add(p1);
		plist.add(p2);
		assertTrue(ps.deleteProductbyExpiryDate(plist));
	}
	
	@Test
	public void deleteProductByIdValidation() throws ClassNotFoundException, SQLException, ProductNotFoundException {
		String string = "2022-04-12";
		LocalDate date = LocalDate.parse(string, DateTimeFormatter.ISO_DATE);
		Product p1 = new Product(178,"bghnjlk",date,4,null,5000);
		assertTrue(ps.deleteProductById(111));
	}
	
	@Test
	public void addEmployee() throws ClassNotFoundException, SQLException, ProductNotFoundException, InvalidProductNameException {
		String string = "2022-04-12";
		LocalDate date = LocalDate.parse(string, DateTimeFormatter.ISO_DATE);
		Product p1 = new Product(111,"book",date,4,null,5000);
		assertEquals(ps.addProduct(p1),"success");
	}


}
