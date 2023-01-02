package com.ims.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ims.model.Product;
import com.ims.service.ProductService;
import com.ims.service.ProductServiceImpl;

public class listAllProductsController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		List<Product> plist = new ArrayList<Product>();

		ProductService ps = new ProductServiceImpl();
		out.println("<h1> List Of Products : </h1>");
		out.println("<table align='left' border='2' bgcolor='orange'width=400 height=200>  ");
		try {
			plist = ps.listAllProducts();
			for (Product p : plist) {
				out.println("<tr><td>" + p.getProductId() + "</td><td>" + p.getProductName() + "</td><td>"
						+ p.getProductManufacturingDate() + "</td><td>" + p.getUseBeforeMonths() + "</td><td>"
						+ p.getProductExpDate() + "</td><td>" + p.getPrice() + "</td></tr>");
			}
		} catch (ClassNotFoundException e) {
			out.print(e.getMessage());
		} catch (SQLException e) {
			out.print(e.getMessage());
		}

		out.println("</table>");
	}

}
