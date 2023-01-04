package com.regx;

public class InvalidEmailorPasswordException extends Exception {
    InvalidEmailorPasswordException(String msg){
    	super(msg);
    }
}

