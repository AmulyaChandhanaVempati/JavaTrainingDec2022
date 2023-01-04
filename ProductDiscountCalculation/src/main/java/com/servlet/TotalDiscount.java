package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class TotalDiscount
 */
public class TotalDiscount extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		double price=(double) session.getAttribute("tp");
		double discount=(price*10)/100;
		double finalAmount=price-discount;
		out.println("<h1>Amount to be Paid = "+finalAmount+"</h1>");
	}

	
}
