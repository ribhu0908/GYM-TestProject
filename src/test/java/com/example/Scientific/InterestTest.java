package com.example.Scientific;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InterestTest {
    Interest inte = new Interest();
    int res;

    @Test
    public void calculate() {
        res = inte.interest(-15, 2, 2);
        assertEquals(-1, res);
        res = inte.interest(15, -2, 2);
        assertEquals(-1, res);
        res = inte.interest(1500, 2, 2);
        assertEquals(60, res);

    }
}
