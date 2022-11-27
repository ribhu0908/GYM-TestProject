package com.example.converter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.example.calculator.BmiCalculator;

public class CalorieConvertorTest {
	
	@SuppressWarnings("deprecation")
	@Test
	public void calToJoule() {
		 CalorieConverter calConv = new CalorieConverter();
	     double calories;

		calories=calConv.calToJoule(2);
	     assertEquals(2*4.1868, calories, 0.1);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void jouleToCal() {
		 CalorieConverter calConv = new CalorieConverter();
	     double calories;

		calories=calConv.jouleToCal(2);
	     assertEquals(2*0.2388459, calories, 0.01);
	}

}
