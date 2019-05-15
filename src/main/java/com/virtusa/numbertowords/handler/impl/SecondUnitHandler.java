package com.virtusa.numbertowords.handler.impl;

import com.virtusa.numbertowords.constants.SecondUnitConstants;
import com.virtusa.numbertowords.handler.UnitHandler;

public class SecondUnitHandler implements UnitHandler {

	UnitHandler unitCountHandler;

	public SecondUnitHandler(UnitHandler unitHandler) {
		this.unitCountHandler = unitHandler;
	}

	public String getUnitValue(Integer number) {
		StringBuilder stringBuilder = new StringBuilder();
		switch (number) {
		case 10:
			stringBuilder.append(SecondUnitConstants.TEN.getSecondUnit());
			break;
		case 11:
			stringBuilder.append(SecondUnitConstants.ELEVEN.getSecondUnit());
			break;
		case 12:
			stringBuilder.append(SecondUnitConstants.TWELVE.getSecondUnit());
			break;
		case 13:
			stringBuilder.append(SecondUnitConstants.THIRTEEN.getSecondUnit());
			break;
		case 14:
			stringBuilder.append(SecondUnitConstants.FOURTEEN.getSecondUnit());
			break;
		case 15:
			stringBuilder.append(SecondUnitConstants.FIFTEEN.getSecondUnit());
			break;
		case 16:
			stringBuilder.append(SecondUnitConstants.SIXTEEN.getSecondUnit());
			break;
		case 17:
			stringBuilder.append(SecondUnitConstants.SEVENTEEN.getSecondUnit());
			break;
		case 18:
			stringBuilder.append(SecondUnitConstants.EIGHTEEN.getSecondUnit());
			break;
		case 19:
			stringBuilder.append(SecondUnitConstants.NINETEEN.getSecondUnit());
			break;
		default:
			handleSecondUnitGTNineTeen(number, stringBuilder);
		}
		return stringBuilder.toString();
	}

	private void handleSecondUnitGTNineTeen(Integer number, StringBuilder stringBuilder) {
		Integer reminder = number / 10;
		switch (reminder) {
		case 2:
			stringBuilder.append(SecondUnitConstants.TWENTY.getSecondUnit());
			break;
		case 3:
			stringBuilder.append(SecondUnitConstants.THIRTY.getSecondUnit());
			break;
		case 4:
			stringBuilder.append(SecondUnitConstants.FORTY.getSecondUnit());
			break;
		case 5:
			stringBuilder.append(SecondUnitConstants.FIFTY.getSecondUnit());
			break;
		case 6:
			stringBuilder.append(SecondUnitConstants.SIXTY.getSecondUnit());
			break;
		case 7:
			stringBuilder.append(SecondUnitConstants.SEVENTY.getSecondUnit());
			break;
		case 8:
			stringBuilder.append(SecondUnitConstants.EIGHTY.getSecondUnit());
			break;
		case 9:
			stringBuilder.append(SecondUnitConstants.NINETY.getSecondUnit());
			break;
		default:
			stringBuilder.append("");
		}

		stringBuilder.append(unitCountHandler.getUnitValue(number % 10));
	}

}
