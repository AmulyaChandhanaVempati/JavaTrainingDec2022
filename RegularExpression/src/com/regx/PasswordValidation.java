package com.regx;

import java.util.regex.Pattern;

public class PasswordValidation {

	public boolean passwordValidation(String password) throws InvalidEmailorPasswordException {
		if (password == null || password.isEmpty()) {
			throw new InvalidEmailorPasswordException("Invalied Password");
		}
		return Pattern.matches("^[a-zA-Z0-9]+@*[a-zA-Z0-9]+{8,20}$", password);
	}

}
