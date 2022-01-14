package com.example.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class IdealWeightCalculatorTest {

    @Test
    public void calculate() {
        IdealWeightCalculator idealWeightCalculator = new IdealWeightCalculator();
        String res;

        res=idealWeightCalculator.calculate(10,'F',0);
        assertEquals("Invalid Input", res);


        res=idealWeightCalculator.calculate(18,'M',165);
        assertNotEquals("Invalid Input", res);

        res=idealWeightCalculator.calculate(25,'f',175);
        assertNotEquals("Invalid Input", res);
    }
}