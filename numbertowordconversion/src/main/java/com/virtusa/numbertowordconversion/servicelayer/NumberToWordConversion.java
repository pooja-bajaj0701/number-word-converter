package com.virtusa.numbertowordconversion.servicelayer;

import com.virtusa.numbertowordconversion.dao.NumberToWordDao;

public class NumberToWordConversion {
	
	public String numberToWordConversion(String number) {
		String wordName = null;
		Integer numberValue = Integer.parseInt(number);
		NumberToWordDao wordValue = new NumberToWordDao();
		wordName = wordValue.dataStorageOfAllNumbers(numberValue);
		if(wordName != null) {
			return wordName;
		} else {
			StringBuffer wordString = new StringBuffer();
			StringBuffer finalString = new StringBuffer();
			for(int i=number.length() - 1;i >= 0 ; i--) {
				if(number.charAt(i)  > 0 && i > 0 ) {
					int numValue = Character.getNumericValue(number.charAt(i));
					String word = wordValue.dataStorageOfAllNumbers(numValue);
					wordString = wordString.append(word).append(" ");
				} else {
					StringBuffer newNumber = new StringBuffer();
					newNumber = newNumber.append(number.charAt(0));
					for(int j=1;j< number.length();j++) {
						newNumber = newNumber.append('0');
					}
					String word = wordValue.dataStorageOfAllNumbers(Integer.parseInt(newNumber.toString()));
					wordString = wordString.append(word);
				}
			}
			String arr[] = wordString.toString().split(" ");
			for(int counter = arr.length - 1; counter >= 0 ; counter--) {
				 finalString = finalString.append(arr[counter]).append(" ");
			}
			return finalString.toString();
		}
	}
}
