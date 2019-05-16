package com.virtusa.numbertowords.service.impl;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumberToWordConverterTest {

	@Test
	public void convertToWordsTest() {
		assertEquals("one hundred ", NumberToWordConverter.convertToWords(100));
		assertEquals("one hundred and five ", NumberToWordConverter.convertToWords(105));
		assertEquals("fifty one ", NumberToWordConverter.convertToWords(51));
		assertEquals("two thousand five hundred and fifty one ", NumberToWordConverter.convertToWords(2551));
		assertEquals("", NumberToWordConverter.convertToWords(-1));
	}
	
}
