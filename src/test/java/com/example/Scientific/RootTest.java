package com.example.Scientific;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RootTest {
    Squareroot root = new Squareroot();
    int res;

    @Test
    public void calculate() {
        res = root.root(4);
        assertEquals(2, res);
        res = root.root(-2);
        assertEquals(-1, res);
    }
}
