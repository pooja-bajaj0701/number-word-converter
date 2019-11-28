package com.virtusa.numbertowordconversion.validations;


public class ValidNumber {

	public boolean validateIfNumber(String str) {
		try {
			int number = Integer.valueOf(str);
		if(number > 0) {
			return true;
		} else {
			return false;
		}
		} catch(Exception e) {
			return false;
		}

	}

}
