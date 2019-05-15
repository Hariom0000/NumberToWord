package com.virtusa.numbertowords.handler;

/**
 * This interface implementation classes responsible for converting the number
 * to word and calling further responsible classes
 * 
 * @author hariom
 *
 */
public interface UnitHandler {
	/**
	 * This method convert the number to word representation
	 * 
	 * @param number
	 * @return String number's word representation
	 */
	public String getUnitValue(Integer number);
}
