package com.example.Scientific;
import static org.junit.Assert.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class Additiontest {
Addition addition = new Addition();
int res;
    @Test
    public void calculate() {
        res = addition.add(10, 20);
        assertEquals(30, res);
        res = addition.add(10, 20);
        assertNotEquals(40, res);



}


}
