package com.example.Scientific;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class subtractTest {
    Subtraction sub = new Subtraction();
    int res;
    @Test
    public void calculate() {
        res = sub.subtraction(20, 10);
        assertEquals(10, res);
        res = sub.subtraction(10, 20);
        assertEquals(-10, res);



    }
}
