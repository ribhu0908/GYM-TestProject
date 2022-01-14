package com.example.converter;

public class HeightConverter {
	// meter, cm to feet and vice versa
	
	public double cmToFoot(double cm) {
		return cm*0.0328084;
	}
	
	public double cmTometer(double cm) {
		return cm/100;
	}
	
	public double meterToFoot(double meter) {
		return meter*3.28084;
	}
	
	public double meterToCm(double meter) {
		return meter*100;
	}
	
	public double footToCm(double foot) {
		return foot*30.480000975359999416;
	}
	
	public static double footToMeter(double foot) {
		return foot*0.3048000;
	}
}
