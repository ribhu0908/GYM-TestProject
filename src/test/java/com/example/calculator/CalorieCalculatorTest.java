package com.example.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalorieCalculatorTest {

    @Test
    public void calculate() {

        CalorieCalculator calorieCalculator = new CalorieCalculator();
        String res;

        res=calorieCalculator.calculate(10,'F',0,0,0);
        assertEquals("Invalid Inputs", res);

        res=calorieCalculator.calculate(78,'M',1.70,70,1);
        assertNotEquals("Invalid Inputs", res);

        res=calorieCalculator.calculate(30,'F',1.65,55, 2);
        assertNotEquals("Invalid Inputs", res);

        res=calorieCalculator.calculate(32,'f',1.70,75,3);
        assertNotEquals("Invalid Inputs", res);

        res=calorieCalculator.calculate(59,'m',1.74,84,4);
        assertNotEquals("Invalid Inputs", res);

        res=calorieCalculator.calculate(62,'F',1.64,70,5);
        assertNotEquals("Invalid Inputs", res);

    }
}