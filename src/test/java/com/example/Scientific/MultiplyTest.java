package com.example.Scientific;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class MultiplyTest {
    Multiplication mult = new Multiplication();
    int res;
    @Test
    public void calculate() {
        res = mult.multiply(10,20);
        assertEquals(200, res);
        res = mult.multiply(20,20);
        assertEquals(400, res);




    }
}
