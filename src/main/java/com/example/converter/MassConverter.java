package com.example.converter;

public class MassConverter {
	// kg, grams to pound and vice versa
	public double kgToGram(double kg) {
		return kg*1000;
	}
	
	public double kgToPound(double kg) {
		return kg*2.204;
	}
	
	public double gramToKg(double gram) {
		return gram/1000;
	}
	
	public double gramToPound(double gram) {
		return gram*0.00220462;
	}

	public double poundToGram(double pound) {
		return pound*453.592;
	}
	
	public double poundToKg(double pound) {
		return pound*0.453592;
	}
}
