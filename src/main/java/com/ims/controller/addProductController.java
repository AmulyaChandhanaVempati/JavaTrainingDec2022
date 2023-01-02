package com.ims.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ims.exception.InvalidProductNameException;
import com.ims.model.Product;
import com.ims.service.ProductService;
import com.ims.service.ProductServiceImpl;



public class addProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		Integer prductId=Integer.parseInt(request.getParameter("id"));
		String productName=request.getParameter("name");
		LocalDate manufacturingDate = (LocalDate.parse(request.getParameter("manufacturingDate")));
		Integer useBeforeMonths = Integer.parseInt(request.getParameter("useBeforeMonths"));
		Integer price = Integer.parseInt(request.getParameter("price"));
		
		Product p = new Product();
		p.setProductId(prductId);
		p.setProductName(productName);
		p.setProductManufacturingDate(manufacturingDate);
		p.setUseBeforeMonths(useBeforeMonths);
		p.setPrice(price);
	
		try {
			ProductService es=new ProductServiceImpl();
			String result=es.addProduct(p);
			if(result=="success")
			out.println("Product added successfully...");
			else
				out.println("Product not added ..");
			
		} catch (ClassNotFoundException e) {
			out.print(e.getMessage());
		} catch (SQLException e) {
			out.print(e.getMessage());
		} catch (InvalidProductNameException e) {
			out.print(e.getMessage());
		}
	}
	

}
