package com.regx;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class EmailValidationTest {

	EmailValidation object;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		object = new EmailValidation();
	}

	@AfterEach
	void tearDown() throws Exception {
		object = null;
	}

	@Test
	void ValidateEmailIdValidEmailId() throws InvalidEmailorPasswordException {
	   boolean value = object.validateEmail("vempatiamulya487@gmail.com");
	   Assertions.assertTrue(value);
	}
   @Test
   void ValidateEmailIdInvalidEmailId() throws InvalidEmailorPasswordException{
	   boolean value = object.validateEmail("James_Potter@infy.org");
	   Assertions.assertFalse(value);
   }
   @Test
   void validateEmailIdInvalidEmailIdException() throws InvalidEmailorPasswordException{
	   Exception e = Assertions.assertThrows(InvalidEmailorPasswordException.class,()->object.validateEmail(null));
	   Assertions.assertEquals(e.getMessage(), "Invalid Email Id");
   }
   @ParameterizedTest
	@CsvSource(value = { "Sirius_Black,false", "Lily_Evans@Hoggy.in,true", "Remus_Lups,false", "NymphieTonks@magic.com,true" })
	public void validateEmailIdParamterizedEmailId(String inputEmail, Boolean expectOutput) throws InvalidEmailorPasswordException {
		Assertions.assertEquals(expectOutput, object.validateEmail(inputEmail));
	}

}
