package com.virtusa.numbertowords.constants;

public enum SecondUnitConstants {
	TEN("ten "), ELEVEN("eleven "), TWELVE("twelve"), THIRTEEN("thirteen "), FOURTEEN("fourteen "), FIFTEEN("fifteen "), SIXTEEN(
			"sixteen "), SEVENTEEN("seventeen "), EIGHTEEN("eighteen "), NINETEEN("nineteen "), TWENTY(
					"twenty "), THIRTY("thirty "), FORTY("forty "), FIFTY(
							"fifty "), SIXTY("sixty "), SEVENTY("seventy "), EIGHTY("eighty "), NINETY("ninety ");
	String secondUnit;

	private SecondUnitConstants(String secondUnit) {
		this.secondUnit = secondUnit;
	}
	
	public String getSecondUnit() {
		return this.secondUnit;
	}
}
