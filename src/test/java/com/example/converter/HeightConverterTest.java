package com.example.converter;

import org.junit.Test;

import static org.junit.Assert.*;

public class HeightConverterTest {

	HeightConverter hc = new HeightConverter();
	double height;
    
    @Test
	public void cmToFoot() {
		height = hc.cmToFoot(2);
		assertEquals(2*0.0328084, height, 0.1);
	}
    
    @Test
	public void cmTometer() {
    	height = hc.cmTometer(2000);
		assertEquals(2000/100, height, 0.1);
	}
    
    @Test
	public void meterToFoot( ) {
    	height = hc.meterToFoot(2);
		assertEquals(2*3.28084, height, 0.1);
	}
    
    @Test
	public void meterToCm() {
    	height = hc.meterToCm(2);
    	assertEquals(2*100, height, 0.1);
	}
    
    @Test
	public void footToCm() {
    	height = hc.footToCm(2);
    	assertEquals(2*30.48000097, height, 0.1);
	}
    
    @Test
	public void footToMeter() {
		height = hc.footToMeter(2);
		assertEquals(2*0.3048000, height, 0.1);
	}
}