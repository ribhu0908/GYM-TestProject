package com.example.converter;

import org.junit.Test;

import static org.junit.Assert.*;

public class MassConverterTest {
	
	MassConverter massConv = new MassConverter();
	double weight;

    @Test
    public void kgToGram() {
        weight = massConv.kgToGram(2);
    	assertEquals(2*1000, weight, 0.1);

    }

    @Test
    public void kgToPound() {
        weight = massConv.kgToPound(2);
    	assertEquals(2*2.204, weight, 0.1);
    }

    @Test
    public void gramToKg() {
        weight = massConv.gramToKg(10000);
    	assertEquals(10, weight, 0.1);
    }

    @Test
    public void gramToPound() {
    	weight = massConv.gramToPound(1000);
    	assertEquals(1000*0.00220462, weight, 0.1);
    }

    @Test
    public void poundToGram() {
    	weight = massConv.poundToGram(15);
    	assertEquals(15*453.592, weight, 0.1);
    }

    @Test
    public void poundToKg() {
    	weight = massConv.poundToKg(50);
    	assertEquals(50*0.453592, weight, 0.1);
    }
}