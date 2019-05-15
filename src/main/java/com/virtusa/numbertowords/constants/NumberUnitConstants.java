package com.virtusa.numbertowords.constants;

public enum NumberUnitConstants {
	HUNDRED_CONSTANT("hundred "), THOUSAND_CONSTANT("thousand "), MILLION_CONSTANT(
			"million "), BILLION_CONSTANT("billion "), TRILLION_CONSTANT("trillion");
	String unit;

	NumberUnitConstants(String unit) {
		this.unit = unit;
	}
	
	public String getUnit() {
		return this.unit;
	}
}
