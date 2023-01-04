package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pms.model.Product;
import com.pms.service.ProductService;
import com.pms.service.ProductServiceImpl;

public class UpdateProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UpdateProductController() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Integer id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		Double qty = Double.parseDouble(request.getParameter("qty"));
		Double price = Double.parseDouble(request.getParameter("price"));
		Product product = new Product();
		product.setId(id);
		product.setName(name);
		product.setQty(qty);
		product.setPrice(price);
		try {
			ProductService ps = new ProductServiceImpl();
			List<Product> list = new ArrayList<Product>();
			list = ps.listAllProducts();

			String str = "Invalied Product Id <br>";
			boolean flag = false;
//			for (int i = 0; i < list.size(); i++) {
//
//				if (list.get(i).getId() == id) {
//					flag = true;
//					out.print("ID found");
//					String result = ps.update(product);
//					if (result.equals("success")) {
//						str = "Product Updated Successfully <br>";
//					} else {
//						str = "Product Not Updated <br>";
//					}
//				}
//
//			}
			Iterator it = list.iterator();
			while (it.hasNext()) {
				Product p = (Product) it.next();
				if (p.getId() == id) {
					flag = true;
					out.print("ID found");
					String result = ps.update(product);
					if (result.equals("success")) {
						str = "Product Updated Successfully <br>";
					}
				}
			}
//			if (flag == false) {
//				out.println(" Not Inside for loop <br>");
//				out.println("list length: " + list.size());
//			}
			out.println(str);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
