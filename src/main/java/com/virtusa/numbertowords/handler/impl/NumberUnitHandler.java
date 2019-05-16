package com.virtusa.numbertowords.handler.impl;

import com.virtusa.numbertowords.constants.NumberUnitConstants;
import com.virtusa.numbertowords.handler.UnitHandler;

/**
 * This class responsible to add number units and calling the other responsible
 * component for further processing
 * 
 * @author hariom
 *
 */
public class NumberUnitHandler implements UnitHandler {
	private Integer count = 0;
	public static final String AND_CONSTANT = "and ";

	UnitHandler secondUnitHandler;

	/**
	 * The Constructor
	 * @param unitHandler
	 *           further processing component
	 */
	public NumberUnitHandler(UnitHandler unitHandler) {
		this.secondUnitHandler = unitHandler;
	}

	public String getUnitValue(Integer number) {
		StringBuilder stringBuilder = new StringBuilder();
		switch (count) {
		case 3:
			stringBuilder.append(NumberUnitConstants.HUNDRED_CONSTANT.getUnit()).append(AND_CONSTANT);
			break;
		case 4:
			stringBuilder.append(NumberUnitConstants.THOUSAND_CONSTANT.getUnit());
			break;
		case 5:
			stringBuilder.append(NumberUnitConstants.MILLION_CONSTANT.getUnit());
			break;
		case 6:
			stringBuilder.append(NumberUnitConstants.BILLION_CONSTANT.getUnit());
			break;
		case 7:
			stringBuilder.append(NumberUnitConstants.TRILLION_CONSTANT.getUnit());
			break;
		default:
			stringBuilder.append("");
		}
		return new StringBuilder().append(secondUnitHandler.getUnitValue(number)).append(stringBuilder).toString();
	}

	public void incrementCount() {
		count++;
	}

	public Integer getCount() {
		return count;
	}

}
