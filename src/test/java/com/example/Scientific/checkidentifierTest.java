package com.example.Scientific;

import com.example.Operations.checkidentifier;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class checkidentifierTest {
    checkidentifier ck = new checkidentifier();
    @Test
    void is_identifier_test(){

        assertEquals(false, ck.is_identifier("1"));
        assertEquals(false, ck.is_identifier("a!"));
        assertEquals(true,  ck.is_identifier("a1"));
        assertEquals(true,  ck.is_identifier("a1\0"));
    }
}
