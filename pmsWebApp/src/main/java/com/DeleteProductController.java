package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pms.service.ProductService;
import com.pms.service.ProductServiceImpl;

public class DeleteProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public DeleteProductController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Integer id = Integer.parseInt(request.getParameter("id"));
		try {
			ProductService productService = new ProductServiceImpl();
			String result = productService.deleteProduct(id);
			if(result.equals("success")) {
				out.println("Product Deleted Successfully");
			}
			else {
				out.println("Product Not Deleted!!!");
			}
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

	

}
