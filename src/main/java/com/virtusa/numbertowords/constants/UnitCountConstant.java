package com.virtusa.numbertowords.constants;

public enum UnitCountConstant {
	ONE("one "), TWO("two "), THREE("three "), FOUR("four "), FIVE("five "), SIX("six "), SEVEN("seven "), EIGHT(
			"eight "), NINE("nine ");
	String unitCount;

	private UnitCountConstant(String unitCount) {
		this.unitCount = unitCount;
	}

	public String getUnitCount() {
		return this.unitCount;
	}
}
