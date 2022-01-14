package com.example.calculator;

import java.util.Scanner;

public class CalorieCalculator {
	
	public String calculate(int age, char gender, double h, double w, int activityLevel) {
		double bmr = (new BmrCalculator()).calculateBmr(age, gender, h, w);
	    double cal = -1;
	    if(bmr > 0) {
	    	if(activityLevel == 1)
		    	cal =  bmr*1.2;
	    	else if(activityLevel == 2)
	    	    cal = bmr*1.375;
	    	else if(activityLevel == 3)
	    		cal = bmr*1.55;
	    	else if(activityLevel == 4)
	    		cal = bmr*1.725;
	    	else if(activityLevel == 5)
	    		cal = bmr*1.9;
	    }
	    
	    if(cal > 0 && cal != -1)
	    	return "Number of calories to consume everyday: " + cal;
    	return "Invalid Inputs";
	}
}
