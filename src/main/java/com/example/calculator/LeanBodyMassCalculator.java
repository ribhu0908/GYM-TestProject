package com.example.calculator;

import java.util.Scanner;

public class LeanBodyMassCalculator {
	public double calcBodyMass(char younger, char gender, double height, double weight) {
		double mass = -1;
		if(height > 0 && weight > 0) {
			if(younger == 'N' || younger == 'n') {
				if(gender == 'M' || gender == 'm')
					mass = 0.407*weight + 0.267*height - 19.2;
				else if(gender == 'F' || gender == 'f')
					mass = 0.252*weight + 0.473*height - 48.3;
			}
			else if (younger == 'Y' || younger == 'y') {
				double inter_w = Math.pow(weight, 0.6469);
				double inter_h = Math.pow(height, 0.7236);
				mass = 0.0215*inter_w*inter_h;
			}
		}
		return mass;
	}

	public String calculate(char younger, char gender, double height, double weight) {
		double mass = calcBodyMass(younger, gender, height, weight);
    	if(mass > 0 && mass != -1)
    		return "Lean Body Mass" + mass;
    	return "Invalid inputs";
	}
}