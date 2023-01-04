package com.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.exception.EmployeeNotFoundException;
import com.model.Employee;
import com.service.EmployeeService;
import com.service.EmployeeServiceImpl;


public class deleteEmployeebyContractDateController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		try {
			EmployeeService es=new EmployeeServiceImpl();
			List<Employee> emp = es.listAllEmployees();
			boolean result=es.deleteEmployeebyContractDate(emp);
			if(result)
			out.println("Employee Deleted Successfully...");
			else
				out.println("Employee Not Deleted ...");		
		} catch (ClassNotFoundException e) {
			out.print(e.getMessage());
		} catch (SQLException e) {
			out.print(e.getMessage());
		}
		catch (EmployeeNotFoundException e) {
			out.print(e.getMessage());
		}
	}

	

}
