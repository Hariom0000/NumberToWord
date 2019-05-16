package com.virtusa.numbertowords.service.impl;

import com.virtusa.numbertowords.handler.impl.NumberUnitHandler;
import com.virtusa.numbertowords.handler.impl.SecondUnitHandler;
import com.virtusa.numbertowords.handler.impl.UnitCountHandler;

/**
 * This class takes input from console and convert the input number words
 * representation
 * 
 * @author hariom
 *
 */
public class NumberToWordConverter {

	public static void main(String[] args) {
		Integer number = 56945781;
		if (number > 0) {
			convertToWords(number);
		} else {
			System.err.println("Enter number is not valid");
		}
	}

	/**
	 * This method use to convert integer value to words
	 * 
	 * @param number
	 *            input integer value
	 */
	public static String convertToWords(Integer number) {
		NumberUnitHandler unitHandler = new NumberUnitHandler(new SecondUnitHandler(new UnitCountHandler()));
		StringBuilder builder = new StringBuilder();
		String wordRepresntation = "";
		unitHandler.incrementCount();
		Integer reminder = -1;
		while (number > 0) {
			unitHandler.incrementCount();
			if (unitHandler.getCount() == 3) {
				reminder = number % 10;
				number = number / 10;
			} else {
				reminder = number % 100;
				number = number / 100;
			}
			builder.insert(0, unitHandler.getUnitValue(reminder));
		}
		Integer andLastINdex = builder.lastIndexOf(NumberUnitHandler.AND_CONSTANT);
		if (builder.toString().length() - andLastINdex == 4) {
			wordRepresntation = builder.substring(0, andLastINdex);
		}else {
			wordRepresntation = builder.toString();
		}
		return wordRepresntation;
	}
}
