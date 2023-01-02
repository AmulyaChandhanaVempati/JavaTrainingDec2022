package com.ims.validations;

import java.time.LocalDate;
import java.util.regex.Pattern;

import com.ims.exception.InvalidProductNameException;
import com.ims.model.Product;



public class ProductValidations {
	
	public  String validateProduct(Product product) throws InvalidProductNameException{
		boolean flag = false;
		ProductValidations v = new ProductValidations();
		try {
			flag = v.productNameValidation(product.getProductName());
		}
		catch(InvalidProductNameException e) {
			return e.getMessage();
		}
		if(product.getProductId()==null) {
			return "Product Id Can Not Be Null";
		}
		else if(flag==false) {
			return "Invalid Product Name";
		}
		else if(productPriceValidation(product.getPrice())==false) {
			return "Product Price Can Not Be 0 or negative";
		}
//		else if(productManfacturingDateValidation(product.getProductManufacturingDate(),product.getProductExpDate())==false) {
//			return "Manufacturing Date Should Always Be Less Than Expiry Date";
//		}
		return "success";
	}
	public boolean productNameValidation(String productName) throws InvalidProductNameException {
		if(productName==null) {
			throw new InvalidProductNameException("Name Can Not Be Null");
		}
		else {
			return Pattern.matches("[a-zA-Z]{2,15}$", productName);
		}
	}
	public boolean productManfacturingDateValidation(LocalDate md,LocalDate ed) {
		if(md.compareTo(ed)<=0) {
			return false;
		}
		return true;
	}
	public boolean productPriceValidation(Double price) {
		if(price <=0) {
			return false;
		}
		return true;
	}

}
