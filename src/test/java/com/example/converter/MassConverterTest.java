package com.example.converter;

import org.junit.Test;

import static org.junit.Assert.*;

public class MassConverterTest {
	
	MassConverter massConv = new MassConverter();
	double res;

    @Test
    public void kgToGram() {
    	res = massConv.kgToGram(2);
    	assertEquals(2*1000, res, 0.1);

    }

    @Test
    public void kgToPound() {
    	res = massConv.kgToPound(2);
    	assertEquals(2*2.204, res, 0.1);
    }

    @Test
    public void gramToKg() {
    	res = massConv.gramToKg(10000);
    	assertEquals(10, res, 0.1);
    }

    @Test
    public void gramToPound() {
    	res = massConv.gramToPound(1000);
    	assertEquals(1000*0.00220462, res, 0.1);
    }

    @Test
    public void poundToGram() {
    	res = massConv.poundToGram(15);
    	assertEquals(15*453.592, res, 0.1);
    }

    @Test
    public void poundToKg() {
    	res = massConv.poundToKg(50);
    	assertEquals(50*0.453592, res, 0.1);
    }
}