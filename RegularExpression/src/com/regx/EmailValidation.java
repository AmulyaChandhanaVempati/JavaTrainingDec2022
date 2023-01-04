package com.regx;

import java.util.regex.Pattern;

public class EmailValidation {
	
	public boolean validateEmail(String emailId)throws InvalidEmailorPasswordException { 
		if(emailId==null || emailId.isEmpty())
			throw new InvalidEmailorPasswordException("Invalid Email Id");
		else {
			return Pattern.matches("[a-zA-Z0-9-_]+@[a-zA-z0-9-_]+[.](com|in)$", emailId);
		}
	}
}
