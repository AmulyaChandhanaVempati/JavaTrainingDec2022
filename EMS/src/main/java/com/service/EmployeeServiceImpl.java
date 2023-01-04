package com.service;

import java.sql.SQLException;
import java.util.List;

import com.dao.EmployeeDAO;
import com.dao.EmployeeDAOImpl;
import com.exception.EmployeeNotFoundException;
import com.exception.InvalidEmployeeNameException;
import com.model.Employee;

public class EmployeeServiceImpl implements EmployeeService{

	@Override
	public String addEmployee(Employee employee) throws SQLException, ClassNotFoundException,InvalidEmployeeNameException {
		EmployeeDAO eDAO = new EmployeeDAOImpl();
		if(eDAO.addEmployee(employee)=="success") {
			return "success";
		}
		return eDAO.addEmployee(employee);
	}

	@Override
	public boolean updateAllEmployeeContractEndDate(List<Employee> emplyeeList)
			throws SQLException, ClassNotFoundException {
		EmployeeDAO eDAO = new EmployeeDAOImpl();
		if(eDAO.updateAllEmployeeContractEndDate(emplyeeList)=="success") {
			return true;
		}
		return false;
	}

	@Override
	public boolean updateEmployeeById(Employee emp)
			throws SQLException, ClassNotFoundException, EmployeeNotFoundException {
		EmployeeDAO eDAO = new EmployeeDAOImpl();
		if(eDAO.updateEmployeeById(emp)=="success") {
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteEmployeebyContractDate(List<Employee> employeeList)
			throws SQLException, ClassNotFoundException,EmployeeNotFoundException {
		EmployeeDAO eDAO = new EmployeeDAOImpl();
		if(eDAO.deleteEmployeebyContractDate(employeeList)=="success") {
			return true;
		}
		return false;
	}

	@Override
	public List<Employee> listAllEmployees() throws SQLException, ClassNotFoundException {
		EmployeeDAO eDAO = new EmployeeDAOImpl();
		List<Employee> list = eDAO.listAllEmployees();
		return list;
	}

	@Override
	public boolean deleteEmployeeById(Integer employeeId)
			throws SQLException, ClassNotFoundException, EmployeeNotFoundException {
		EmployeeDAO eDAO = new EmployeeDAOImpl();
		if(eDAO.deleteEmployeeById(employeeId)=="success") {
			return true;
		}
		return false;
	}
}
