package com.regx;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PasswordValidationTest {
	PasswordValidation object;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		object = new PasswordValidation();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void ValiedPassword() throws InvalidEmailorPasswordException  {
		//fail("Not yet implemented");
		PasswordValidation pv = new PasswordValidation();
		assertTrue(pv.passwordValidation("Amulya741"));
	}
	@Test
	void InvaliedPassword() throws InvalidEmailorPasswordException {
		PasswordValidation ps = new PasswordValidation();
		assertFalse(ps.passwordValidation("@adj789"));
	}
	
	@Test
	void passwordException() throws InvalidEmailorPasswordException{
		Exception e = assertThrows(InvalidEmailorPasswordException.class, ()->object.passwordValidation(null));
		Assertions.assertEquals(e.getMessage(),"Invalied Password");
	}

}
