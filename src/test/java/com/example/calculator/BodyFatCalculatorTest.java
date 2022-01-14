package com.example.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class BodyFatCalculatorTest {

    @Test
    public void calculate() {
        BodyFatCalculator bodyFatCalculator = new BodyFatCalculator();
        String res;

        res = bodyFatCalculator.calculate('f', Double.valueOf(0), Double.valueOf(0), Double.valueOf(0), Double.valueOf(0), Double.valueOf(0));
        assertEquals("Invalid Inputs", res);
        //Essential Fat percentage
        res = bodyFatCalculator.calculate('f', 55, 2.5, 0.3, 0.7, 70);
        assertNotEquals("Invalid Inputs", res);
        //Athletes. Fat percentage
        res = bodyFatCalculator.calculate('f', 60, 2.2, 0.3, 0.7, 70);
        assertNotEquals("Invalid Inputs", res);
        //Fitness fat. Fat percentage
        res = bodyFatCalculator.calculate('f', 60, 1.5, 0.3, 0.7, 70);
        assertNotEquals("Invalid Inputs", res);
        //Average Fit. Fat percentage
        res = bodyFatCalculator.calculate('f', 80, 1.2, 0.3, 0.7, 70);
        assertNotEquals("Invalid Inputs", res);
        //Obese. Fat percentage
        res = bodyFatCalculator.calculate('f', 80, 1, 0.3, 0.7, 70);
        assertNotEquals("Invalid Inputs", res);

// same way we can design test cases for men



    }

}