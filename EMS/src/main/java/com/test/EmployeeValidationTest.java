package com.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.Test;

import com.exception.InvalidEmployeeNameException;
import com.model.Employee;
import com.validations.EmployeeValidations;

public class EmployeeValidationTest {
	EmployeeValidations ev = new EmployeeValidations();;

	@Test
	public void employeeNameValidation_Valid() throws InvalidEmployeeNameException {
		assertTrue(ev.employeeNameValidation("Amulya"));
	}

	@Test
	public void employeeNameValidation_Invalid() throws InvalidEmployeeNameException {
		assertFalse(ev.employeeNameValidation("AmulyaChandhanaVempati"));
	}

	@Test
	public void employeeNameValidation_Invalid1() throws InvalidEmployeeNameException {
		assertFalse(ev.employeeNameValidation("345Amulya"));
	}

	@Test
	public void employeeNameValidation_Invalid2() throws InvalidEmployeeNameException {
		assertFalse(ev.employeeNameValidation("Amulya@Vempati"));
	}
    
	@Test
	public void validateEmployeeValidation_Valid() throws InvalidEmployeeNameException {
		String string = "2022-04-12";
		LocalDate date = LocalDate.parse(string, DateTimeFormatter.ISO_DATE);
		Employee emp = new Employee(111,"Amulya",date,4,null,5000);
		assertEquals(ev.validateEmployee(emp), "success");
	}
	@Test
	public void validateEmployeeValidation_Invalid() throws InvalidEmployeeNameException {
		String string = "2022-04-12";
		LocalDate date = LocalDate.parse(string, DateTimeFormatter.ISO_DATE);
		Employee emp = new Employee(null,"Amulya",date,4,null,5000);
		assertEquals(ev.validateEmployee(emp), "Employee Id Can Not Be Null");
	}

}
