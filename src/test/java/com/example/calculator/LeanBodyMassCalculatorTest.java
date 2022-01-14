package com.example.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class LeanBodyMassCalculatorTest {

    @Test
    public void calcBodyMass() {
    }

    @Test
    public void calculate() {
        LeanBodyMassCalculator leanBodyMassCalculator= new LeanBodyMassCalculator();
        String res;

        res=leanBodyMassCalculator.calculate('n', 'm', 173, 55);
        assertNotEquals("Invalid inputs", res);

        res=leanBodyMassCalculator.calculate('n', 'f', 165, 50);
        assertNotEquals("Invalid inputs", res);

        res=leanBodyMassCalculator.calculate('y', 'm', 172, 58);
        assertNotEquals("Invalid inputs", res);


        res=leanBodyMassCalculator.calculate('y', 'f', -173, -55);
        assertEquals("Invalid inputs", res);
    }
}