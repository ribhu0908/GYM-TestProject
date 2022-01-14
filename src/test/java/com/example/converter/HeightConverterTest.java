package com.example.converter;

import org.junit.Test;

import static org.junit.Assert.*;

public class HeightConverterTest {

	HeightConverter hc = new HeightConverter();
	double res;
    
    @Test
	public void cmToFoot() {
		res = hc.cmToFoot(2);
		assertEquals(2*0.0328084, res, 0.1);
	}
    
    @Test
	public void cmTometer() {
    	res = hc.cmTometer(2000);
		assertEquals(2000/100, res, 0.1);
	}
    
    @Test
	public void meterToFoot( ) {
    	res = hc.meterToFoot(2);
		assertEquals(2*3.28084, res, 0.1);
	}
    
    @Test
	public void meterToCm() {
    	res = hc.meterToCm(2);
    	assertEquals(2*100, res, 0.1);
	}
    
    @Test
	public void footToCm() {
    	res = hc.footToCm(2);
    	assertEquals(2*30.48000097, res, 0.1);
	}
    
    @Test
	public void footToMeter() {
		res = hc.footToMeter(2);
		assertEquals(2*0.3048000, res, 0.1);
 
	}
}