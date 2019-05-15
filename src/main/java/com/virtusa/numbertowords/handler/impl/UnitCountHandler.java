package com.virtusa.numbertowords.handler.impl;

import com.virtusa.numbertowords.constants.UnitCountConstant;
import com.virtusa.numbertowords.handler.UnitHandler;

public class UnitCountHandler implements UnitHandler {

	public String getUnitValue(Integer number) {
		StringBuilder stringBuilder = new StringBuilder();
		switch (number) {
		case 1:
			stringBuilder.append(UnitCountConstant.ONE.getUnitCount());
			break;
		case 2:
			stringBuilder.append(UnitCountConstant.TWO.getUnitCount());
			break;
		case 3:
			stringBuilder.append(UnitCountConstant.THREE.getUnitCount());
			break;
		case 4:
			stringBuilder.append(UnitCountConstant.FOUR.getUnitCount());
			break;
		case 5:
			stringBuilder.append(UnitCountConstant.FIVE.getUnitCount());
			break;
		case 6:
			stringBuilder.append(UnitCountConstant.SIX.getUnitCount());
			break;
		case 7:
			stringBuilder.append(UnitCountConstant.SEVEN.getUnitCount());
			break;
		case 8:
			stringBuilder.append(UnitCountConstant.EIGHT.getUnitCount());
			break;
		case 9:
			stringBuilder.append(UnitCountConstant.NINE.getUnitCount());
			break;
		default:
			stringBuilder.append("");
		}
		return stringBuilder.toString();
	}

}
