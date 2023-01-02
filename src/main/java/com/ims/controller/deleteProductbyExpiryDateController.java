package com.ims.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.ims.exception.ProductNotFoundException;
import com.ims.model.Product;
import com.ims.service.ProductService;
import com.ims.service.ProductServiceImpl;

public class deleteProductbyExpiryDateController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		try {
			ProductService ps=new ProductServiceImpl();
			List<Product> plist = ps.listAllProducts();
			boolean result=ps.deleteProductbyExpiryDate(plist);
			if(result)
			out.println("Product Deleted Successfully...");
			else
				out.println("Product Not Deleted ...");		
		} catch (ClassNotFoundException e) {
			out.print(e.getMessage());
		} catch (SQLException e) {
			out.print(e.getMessage());
		}
		catch (ProductNotFoundException e) {
			out.print(e.getMessage());
		}
	}

}
