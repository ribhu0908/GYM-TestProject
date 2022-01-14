package com.example.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class BmrCalculatorTest {

    @Test
    public void calculate() {
        BmrCalculator bmrCalculator=new BmrCalculator();
        String res;

        res=bmrCalculator.calculate(16,'M',-1,1);
        assertEquals("Invalid Inputs", res);

        res=bmrCalculator.calculate(85,'M',1.70,70);
        assertEquals("Invalid Inputs", res);

        res=bmrCalculator.calculate(30,'F',1.65,55);
        assertNotEquals("Invalid Inputs", res);


    }
    @Test
    public void calculateBmr()
    {
        Double res= BmrCalculator.calculateBmr(23, 'M',1.72,60);
        assertNotEquals( Double.valueOf(-1), res);

        res= BmrCalculator.calculateBmr(25, 'F',0,50);
        assertEquals( Double.valueOf(-1), res);



    }
}