package com.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.exception.EmployeeNotFoundException;
import com.service.EmployeeService;
import com.service.EmployeeServiceImpl;


public class deleteEmployeeByIdController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		Integer empId=Integer.parseInt(request.getParameter("id"));
		try {
			EmployeeService es = new EmployeeServiceImpl();
			boolean result = es.deleteEmployeeById(empId);
			if(result) {
				out.println("Employee deleted Successfully");
			}
			else {
				out.println("Employee Not Deleted");
			}
		}catch(SQLException e) {
			out.print(e.getMessage());
		}catch(ClassNotFoundException e) {
			out.print(e.getMessage());
		}
		catch(EmployeeNotFoundException e) {
			out.print(e.getMessage());
		}
	}

	

}
