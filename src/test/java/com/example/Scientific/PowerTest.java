package com.example.Scientific;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PowerTest {
    Power power = new Power();
    int res;
    @Test
    public void calculate() {
        res = power.power(2,3);
        assertEquals(8, res);
        res = power.power(2,-2);
        assertEquals(-1, res);
        //test case for prime path coverage
        res = power.power(2,1);
        assertEquals(2, res);

    }
}
