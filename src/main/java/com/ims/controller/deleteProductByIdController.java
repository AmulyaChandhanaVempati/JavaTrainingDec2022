package com.ims.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ims.exception.ProductNotFoundException;
import com.ims.service.ProductService;
import com.ims.service.ProductServiceImpl;

public class deleteProductByIdController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Integer productId = Integer.parseInt(request.getParameter("id"));
		try {
			ProductService ps = new ProductServiceImpl();
			boolean result = ps.deleteProductById(productId);
			if (result) {
				out.println("Product deleted Successfully");
			} else {
				out.println("Product Not Deleted");
			}
		} catch (SQLException e) {
			out.print(e.getMessage());
		} catch (ClassNotFoundException e) {
			out.print(e.getMessage());
		} catch (ProductNotFoundException e) {
			out.print(e.getMessage());
		}
	}

}
