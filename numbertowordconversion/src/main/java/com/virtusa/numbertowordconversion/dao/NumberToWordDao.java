package com.virtusa.numbertowordconversion.dao;

import com.virtusa.numbertowordconversion.constants.NumberToWordConstants.wordArray;

public class NumberToWordDao {

	public String dataStorageOfAllNumbers(int number) {
		if(number == 1) {
			return wordArray.ONE.toString();
		}
		if(number == 2) {
			return wordArray.TWO.toString();
		}
		if(number == 3) {
			return wordArray.THREE.toString();
		}
		if(number == 4) {
			return wordArray.FOUR.toString();
		}
		if(number == 5) {
			return wordArray.FIVE.toString();
		}
		if(number == 6) {
			return wordArray.SIX.toString();
		}
		if(number == 7) {
			return wordArray.SEVEN.toString();
		}
		if(number == 8) {
			return wordArray.EIGHT.toString();
		}
		if(number == 9) {
			return wordArray.NINE.toString();
		}
		if(number == 10) {
			return wordArray.TEN.toString();
		}
		if(number == 11) {
			return wordArray.ELEVEN.toString();
		}
		if(number == 12) {
			return wordArray.TWELVE.toString();
		}
		if(number == 13) {
			return wordArray.THIRTEEN.toString();
		}
		if(number == 14) {
			return wordArray.FOURTEEN.toString();
		}
		if(number == 15) {
			return wordArray.FIFTEEN.toString();
		}
		if(number == 16) {
			return wordArray.SIXTEEN.toString();
		}
		if(number == 17) {
			return wordArray.SEVENTEEN.toString();
		}
		if(number == 18) {
			return wordArray.EIGHTEEN.toString();
		}
		if(number == 19) {
			return wordArray.NINETEEN.toString();
		}
		if(number == 20) {
			return wordArray.TWENTY.toString();
		}
		if(number == 30) {
			return wordArray.THIRTY.toString();
		}
		if(number == 40) {
			return wordArray.FORTY.toString();
		}
		if(number == 50) {
			return wordArray.FIFTY.toString();
		}
		if(number == 60) {
			return wordArray.SIXTY.toString();
		}
		if(number == 70) {
			return wordArray.SEVENTY.toString();
		}
		if(number == 80) {
			return wordArray.EIGHTY.toString();
		}
		if(number == 90) {
			return wordArray.NINETY.toString();
		}
		if(number == 100) {
			return wordArray.HUNDRED.toString();
		}
		if(number == 1000) {
			return wordArray.THOUSAND.toString();
		}
		if(number == 1000000) {
			return wordArray.MILLION.toString();
		}
		if(number == 10000000) {
			return wordArray.BILLION.toString();
		}
		if(number == 1000000000) {
			return wordArray.TRILLION.toString();
		}
		return null;
	}
}
