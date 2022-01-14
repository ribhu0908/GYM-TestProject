package com.example.Scientific;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class factorialTest {
    Factorial fact = new Factorial();
    int res;
    @Test
    public void calculate() {
        res = fact.factorial(5);
        assertEquals(120, res);
        res = fact.factorial(-2);
        assertEquals(-1, res);
        //for prime path coverage
        res = fact.factorial(1);
        assertEquals(1, res);



    }
}
