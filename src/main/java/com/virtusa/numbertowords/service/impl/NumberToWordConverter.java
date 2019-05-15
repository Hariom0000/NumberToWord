package com.virtusa.numbertowords.service.impl;

import java.util.Scanner;

import com.virtusa.numbertowords.handler.impl.NumberUnitHandler;
import com.virtusa.numbertowords.handler.impl.SecondUnitHandler;
import com.virtusa.numbertowords.handler.impl.UnitCountHandler;

/**
 * This class takes input from console and convert the input number words representation 
 * @author hariom
 *
 */
public class NumberToWordConverter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number");
		Integer number = scanner.nextInt();
		if (number > 0) {
			convertToWords(number);
		} else {
			System.out.println("Enter number is not valid");
		}
		scanner.close();
	}

	/**
	 * This method use to convert integer value to words
	 * @param number
	 *          input integer value
	 */
	private static void convertToWords(Integer number) {
		NumberUnitHandler unitHandler = new NumberUnitHandler(new SecondUnitHandler(new UnitCountHandler()));
		StringBuilder builder = new StringBuilder();
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

		System.out.println(builder.toString());
	}
}
