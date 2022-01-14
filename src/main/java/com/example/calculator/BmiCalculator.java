package com.example.calculator;


import java.util.Scanner;

public class BmiCalculator {
    public double calculateBmi(double height, double weight) {
    	double bmi;
    	if(height > 0 && weight > 0)
    		bmi = weight/(height*height);
    	else
    		bmi = -1;

    	return bmi;
    }

    public String calculate(double height, double weight)
    {
    	double bmi = new BmiCalculator().calculateBmi(height, weight);
//    	sc.close();
    	if (bmi > 0 && bmi < 18.5) {
          return "Underweight. Your BMI is " + bmi;
	    } else if (bmi >= 18.5 && bmi < 25) {
	          return "Healthy. Your BMI is " + bmi;
	    } else if (bmi >= 25 && bmi < 30) {
	          return "Overweight. Your BMI is " + bmi;
	    } else if (bmi >= 30) {
	          return "Obese. Your BMI is " + bmi;
	    }
    	
    	return "Invalid Inputs";
    }
    
}
