package com.service;

import java.sql.SQLException;
import java.util.List;

import com.exception.EmployeeNotFoundException;
import com.exception.InvalidEmployeeNameException;
import com.model.Employee;

public interface EmployeeService {
	public String addEmployee(Employee employee) throws SQLException,ClassNotFoundException,InvalidEmployeeNameException;
	public boolean updateAllEmployeeContractEndDate(List<Employee> emplyeeList) throws SQLException,ClassNotFoundException;
	public boolean updateEmployeeById(Employee emp) throws SQLException,ClassNotFoundException,EmployeeNotFoundException;
	public boolean deleteEmployeebyContractDate(List<Employee> employeeList) throws SQLException,ClassNotFoundException,EmployeeNotFoundException; 
	public List<Employee> listAllEmployees() throws SQLException,ClassNotFoundException;
	public boolean deleteEmployeeById(Integer employeeId) throws SQLException,ClassNotFoundException,EmployeeNotFoundException;

}
