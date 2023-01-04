package com.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.exception.InvalidEmployeeNameException;
import com.model.Employee;
import com.service.EmployeeService;
import com.service.EmployeeServiceImpl;


public class addEmployeeController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		Integer empId=Integer.parseInt(request.getParameter("id"));
		String empName=request.getParameter("name");
		LocalDate joiningDate = (LocalDate.parse(request.getParameter("joiningDate")));
		Integer contractDuration = Integer.parseInt(request.getParameter("contractDuration"));
		Integer commercial = Integer.parseInt(request.getParameter("commercial"));
		
		
		Employee emp=new Employee();
		emp.setEmpId(empId);
		emp.setEmpName(empName);
		emp.setJoiningDate(joiningDate);
		emp.setContractDuration(contractDuration);
		emp.setCommercial(commercial);
		try {
			EmployeeService es=new EmployeeServiceImpl();
			String result=es.addEmployee(emp);
			if(result=="success")
			out.println("Employee added successfully...");
			else
				out.println("Employee not added ..");
			
		} catch (ClassNotFoundException e) {
			out.print(e.getMessage());
		} catch (SQLException e) {
			out.print(e.getMessage());
		} catch (InvalidEmployeeNameException e) {
			out.print(e.getMessage());
		}
	}

	
}
