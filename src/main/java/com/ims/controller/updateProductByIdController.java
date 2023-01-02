package com.ims.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ims.exception.ProductNotFoundException;
import com.ims.model.Product;
import com.ims.service.ProductService;
import com.ims.service.ProductServiceImpl;



public class updateProductByIdController extends HttpServlet {
	
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
			ProductService ps = new ProductServiceImpl();
			List<Product> list = new ArrayList<Product>();
			list = ps.listAllProducts();
			String str = "Invalied Product Id <br>";
			Iterator it = list.iterator();
			while (it.hasNext()) {
				Product p1 = (Product) it.next();
				if (p1.getProductId() == prductId) {
					boolean result = ps.updateProductById(p);
					if (result) {
						str = "Product Updated Successfully <br>";
					}
				}
			}
			out.println(str);
		} catch (ClassNotFoundException e) {
			out.print(e.getMessage());
		} catch (SQLException e) {
			out.print(e.getMessage());
		}
		catch(ProductNotFoundException e) {
			out.print(e.getMessage());
		}
	}

}
