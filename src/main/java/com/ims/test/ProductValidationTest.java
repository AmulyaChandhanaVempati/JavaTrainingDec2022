package com.ims.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.Test;

import com.ims.exception.InvalidProductNameException;
import com.ims.model.Product;
import com.ims.validations.ProductValidations;


public class ProductValidationTest {
	
	ProductValidations pv = new ProductValidations();;

	@Test
	public void productNameValidation_ValidTest() throws InvalidProductNameException {
		assertTrue(pv.productNameValidation("pencil"));
	}

	@Test
	public void productNameValidation_InvalidTest() throws InvalidProductNameException {
		assertFalse(pv.productNameValidation("baghdshfsdjfhgcdsjhbfds"));
	}

	@Test
	public void productNameValidation_Invalid1Test() throws InvalidProductNameException {
		assertFalse(pv.productNameValidation("345bag"));
	}

	@Test
	public void productNameValidation_Invalid2Test() throws InvalidProductNameException {
		assertFalse(pv.productNameValidation("Chocolate@Pen"));
	}
    
	@Test
	public void validateEmployeeValidation_ValidTest() throws InvalidProductNameException {
		String string = "2022-04-12";
		LocalDate dateE = LocalDate.of(2022, 9, 23);
		LocalDate date = LocalDate.parse(string, DateTimeFormatter.ISO_DATE);
		Product p = new Product(234,"basket",date,10,dateE,5000);
		assertEquals(pv.validateProduct(p), "success");
	}
	@Test
	public void validateEmployeeValidation_InvalidTest() throws InvalidProductNameException {
		String string = "2022-04-12";
		LocalDate dateE = LocalDate.of(2022, 9, 23);
		LocalDate date = LocalDate.parse(string, DateTimeFormatter.ISO_DATE);
		Product p = new Product(null,"bottle",date,12,dateE,5000);
		assertEquals(pv.validateProduct(p), "Product Id Can Not Be Null");
	}
	
	
	public void productManfacturingDateValidationTest() {
		String string = "2022-04-12";
		LocalDate date = LocalDate.parse(string, DateTimeFormatter.ISO_DATE);
		LocalDate dateE = LocalDate.of(2022, 9, 23);
		Product p = new Product(null,"bottle",date,12,dateE,5000);
		assertTrue(pv.productManfacturingDateValidation(date, dateE));
	}

}
