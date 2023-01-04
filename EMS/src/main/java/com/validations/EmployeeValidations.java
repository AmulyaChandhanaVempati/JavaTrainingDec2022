package com.validations;

import java.util.regex.Pattern;

import com.exception.InvalidEmployeeNameException;
import com.model.Employee;

public class EmployeeValidations {
	
	public  String validateEmployee(Employee employee) throws InvalidEmployeeNameException{
		boolean flag = false;
		EmployeeValidations v = new EmployeeValidations();
		try {
			flag = v.employeeNameValidation(employee.getEmpName());
		}
		catch(InvalidEmployeeNameException e) {
			return e.getMessage();
		}
		if(employee.getEmpId()==null) {
			return "Employee Id Can Not Be Null";
		}
		else if(flag==false) {
			return "Invalid Employee Name";
		}
		return "success";
	}
	public boolean employeeNameValidation(String empName) throws InvalidEmployeeNameException {
		if(empName==null) {
			throw new InvalidEmployeeNameException("Name Can Not Be Null");
		}
		else {
			return Pattern.matches("[a-zA-Z]{5,15}$", empName);
		}
	}
	
	

}
