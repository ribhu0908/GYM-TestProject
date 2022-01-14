package com.example.calculator;

public class BodyFatCalculator {

	public double calculateFat(double weight, double height, double neck, double waist) {
		double fatPercent;
		if(weight > 0 && height > 0 && neck > 0 && waist > 0)
			fatPercent = (495 / (1.0324 - 0.19077*Math.log10(waist-neck) + 0.15456*Math.log10(height))-420);
		else
			fatPercent = -1;
    	return fatPercent;
	}
	
	public double calculateFat(double weight, double height, double neck, double waist, double hip) {
		double fatPercent;
		if(weight > 0 && height > 0 && neck > 0 && waist > 0 && hip > 0)
			fatPercent = (495 / (1.29579 - 0.35004*Math.log10(waist+hip-neck) +  0.22100*Math.log10(height))) - 420;
		else
			fatPercent = -1;
		
		return fatPercent;
	}
	
	public String calculate(char gender,double weight, double height, double neck, double waist, double hip)
    {
		double fat = -1;
		if(gender == 'F' || gender == 'f') {
	    	fat = calculateFat(weight, height, neck, waist);
	//    	sc.close();
	    	if(fat == -1 || fat < 2)
	    		return "Invalid Inputs";
	    	else if (fat >= 2 && fat <= 5) {
	          return "Essential fat. Fat percentage: " + fat;
		    } else if (fat >= 6 && fat <= 13) {
		          return "Athletes. Fat percentage: " + fat;
		    } else if (fat >= 14 && fat <= 17) {
		          return "Fitness. Fat percentage: " + fat;
		    } else if (fat >= 18 && fat <= 25) {
		          return "Average Fit. Fat percentage: " + fat;
		    } else if (fat > 25) {
		          return "Obese. Fat percentage: " + fat;
		    }
		} else if (gender == 'M' || gender == 'm') {
			fat = calculateFat(weight, height , neck, waist);
	    	if(fat == -1 || fat < 10)
	    		return "Invalid Inputs";
	    	else if (fat >= 10 && fat <= 13) {
	          return "Essential fat. Fat percentage: " + fat;
		    } else if (fat >= 14 && fat < 20) {
		          return "Athletes. Fat percentage: " + fat;
		    } else if (fat >= 21 && fat < 24) {
		          return "Fitness. Fat percentage: " + fat;
		    } else if (fat >= 25 && fat <= 31) {
		          return "Average Fit. Fat percentage: " + fat;
		    } else if (fat > 31) {
		          return "Obese. Fat percentage: " + fat;
		    }
		}	
    	return "Invalid Inputs";
    }
	

}
