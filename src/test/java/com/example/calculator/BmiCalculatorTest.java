package com.example.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class BmiCalculatorTest {
	 BmiCalculator bmiCalculator=new BmiCalculator();
     String res;

    @Test
    public void calculate() {

        res=bmiCalculator.calculate(0, 0);
        assertEquals("Invalid Inputs", res);


        res=bmiCalculator.calculate(2, 40);
        assertNotEquals("Underweight. Your BMI is 10", res);

        res=bmiCalculator.calculate(2, 80);
        assertNotEquals("Healthy. Your BMI is 20", res);

        res=bmiCalculator.calculate(1.5, 60);
        assertNotEquals("Overweight. Your BMI is 26.7", res);

        res=bmiCalculator.calculate(1.5, 90);
        assertNotEquals("Obese. Your BMI is 40", res);

        res=bmiCalculator.calculate(1.72, 82);
        assertNotEquals("Obese. Your BMI is 28.1", res);

        res=bmiCalculator.calculate(1.77, 78);
        assertNotEquals("Obese. Your BMI is 24.9", res);

        res=bmiCalculator.calculate(157.48, 35);
        assertNotEquals("Obese. Your BMI is 24.9", res);

    }
       
    @Test
    public void calculateBmi()
    {
        Double res= bmiCalculator.calculateBmi(-1, -1);
        assertEquals( Double.valueOf(-1), res);
        
        res = bmiCalculator.calculateBmi(1.53,70);
        assertEquals(29.90302874, res, 0.1);
        
        
        
    }
}
