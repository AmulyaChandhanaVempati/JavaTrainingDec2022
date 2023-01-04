package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.exception.EmployeeNotFoundException;
import com.exception.InvalidEmployeeNameException;
import com.model.Employee;

public interface EmployeeDAO {
	public String addEmployee(Employee employee) throws SQLException,ClassNotFoundException,InvalidEmployeeNameException;
	public String updateAllEmployeeContractEndDate(List<Employee> emplyeeList) throws SQLException,ClassNotFoundException;
	public String updateEmployeeById(Employee emp) throws SQLException,ClassNotFoundException,EmployeeNotFoundException;
	public String deleteEmployeebyContractDate(List<Employee> employeeList) throws SQLException,ClassNotFoundException,EmployeeNotFoundException; 
	public List<Employee> listAllEmployees() throws SQLException,ClassNotFoundException;
	public String deleteEmployeeById(Integer employeeId) throws SQLException,ClassNotFoundException,EmployeeNotFoundException;

}
