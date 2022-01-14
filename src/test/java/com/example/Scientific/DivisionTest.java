package com.example.Scientific;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DivisionTest {
    Division division = new Division();
    int res;
    @Test
    public void calculate() {
        res = division.division(20, 10);
        assertEquals(2, res);
        res = division.division(10, 0);
        assertEquals(Integer.MIN_VALUE, res);



    }
}
