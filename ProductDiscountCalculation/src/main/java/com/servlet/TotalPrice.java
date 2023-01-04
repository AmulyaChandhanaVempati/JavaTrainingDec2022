package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class TotalPrice extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		double unitPrice = Double.parseDouble(request.getParameter("up"));
		double quantity = Double.parseDouble(request.getParameter("qty"));
		double totalPrice = unitPrice * quantity;

		HttpSession session = request.getSession(true);
		session.setAttribute("tp", totalPrice);
		out.println("<table><tr><td>Name :</td><td>" + request.getParameter("name")
				+ "</td></tr><tr><td>Quantity : </td><td>" + request.getParameter("qty")
				+ "</td></tr><tr><td>Unit Price : </td><td>" + request.getParameter("up") + "</td></tr></table>"
				+ "<h2>Total Price=" + totalPrice
				+ "</h2><form action='TotalDiscount'><input type=submit value='Apply Discount'></form>");
	}

}
