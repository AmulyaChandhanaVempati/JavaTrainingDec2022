package com.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.exception.EmployeeNotFoundException;
import com.exception.InvalidEmployeeNameException;
import com.model.Employee;
import com.service.EmployeeService;
import com.service.EmployeeServiceImpl;

public class EmployeeServiceImplTest {
	EmployeeService es = new EmployeeServiceImpl();
	
	@Test
	public void updateAllEmployeeContractEndDate() throws ClassNotFoundException, SQLException {
		
		String string = "2022-04-12";
		LocalDate date = LocalDate.parse(string, DateTimeFormatter.ISO_DATE);
		Employee emp1 = new Employee(111,"Amulya",date,4,null,5000);
		Employee emp2 =new Employee(112,"Vempati",date,6,null,8000);
		List<Employee> elist = new ArrayList<Employee>();
		elist.add(emp1);
		elist.add(emp2);
		assertTrue(es.updateAllEmployeeContractEndDate(elist));
	}
	
	@Test
	public void updateEmployeeById() throws ClassNotFoundException, SQLException, EmployeeNotFoundException {
		String string = "2022-04-12";
		LocalDate date = LocalDate.parse(string, DateTimeFormatter.ISO_DATE);
		Employee emp1 = new Employee(111,"Amulya",date,4,null,5000);
		assertTrue(es.updateEmployeeById(emp1));
	}
	
	@Test
	public void deleteEmployeebyContractDate() throws ClassNotFoundException, SQLException, EmployeeNotFoundException {
		String string = "2022-04-12";
		LocalDate date = LocalDate.parse(string, DateTimeFormatter.ISO_DATE);
		Employee emp1 = new Employee(111,"Amulya",date,4,null,5000);
		Employee emp2 =new Employee(112,"Vempati",date,6,null,8000);
		List<Employee> elist = new ArrayList<Employee>();
		elist.add(emp1);
		elist.add(emp2);
		assertTrue(es.deleteEmployeebyContractDate(elist));
	}
	
	@Test
	public void deleteEmployeeById() throws ClassNotFoundException, SQLException, EmployeeNotFoundException {
		String string = "2022-04-12";
		LocalDate date = LocalDate.parse(string, DateTimeFormatter.ISO_DATE);
		Employee emp1 = new Employee(111,"Amulya",date,4,null,5000);
		assertTrue(es.updateEmployeeById(emp1));
	}
	
	@Test
	public void addEmployee() throws ClassNotFoundException, SQLException, InvalidEmployeeNameException {
		String string = "2022-04-12";
		LocalDate date = LocalDate.parse(string, DateTimeFormatter.ISO_DATE);
		Employee emp1 = new Employee(111,"Amulya",date,4,null,5000);
		assertEquals(es.addEmployee(emp1),"success");
	}

}
