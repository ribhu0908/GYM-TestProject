package com.example.calculator;

import com.example.converter.*;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		System.out.println("WELCOME TO OUR GYM");

		System.out.println("STEP 1: Lets know your body");

		int choice = getChoice();
		int n1 = 0, n2 = 0;
		char ch;
	    while(choice != 7) {
	    	switch (choice) {
			case 1:
				System.out.println("The Body Mass Index (BMI) Calculator can be used to calculate BMI value and corresponding weight status while taking age into consideration.\n");
				System.out.println("Enter your height in meter: ");
				double height = sc.nextDouble();
				System.out.println("Enter your weight in kg: ");
				double weight = sc.nextDouble();
				System.out.println(new BmiCalculator().calculate(height, weight));
				System.out.println();
				break;
			case 2:
				System.out.println("The Basal Metabolic Rate (BMR) Calculator estimates your basal metabolic rate—the amount of energy expended while at rest in a neutrally temperate environment\n");
				System.out.println("Age (15-80): ");
				int age = sc.nextInt();
				System.out.println("Gender (M/F): " );
				char gender = sc.next().charAt(0);
				System.out.println("Height (cm): ");
				double h = sc.nextDouble();
				System.out.println("Weight (kg): ");
				double w = sc.nextDouble();
				System.out.println(new BmrCalculator().calculate(age,gender,h,w));
				System.out.println();
				break;
			case 3:
				System.out.println("Calculate CALORIES required per activity level");
			    System.out.println("Age (15-80): ");
			    age = sc.nextInt();
			    System.out.println("Gender (M/F): " );
			    gender = sc.next().charAt(0);
			    System.out.println("Height (cm): ");
			    h = sc.nextDouble();
			    System.out.println("Weight (kg): ");
			    w = sc.nextDouble();
			    System.out.println("Activity Level: ");
			    System.out.println("1. Sedentary: little or no exercise ");
			    System.out.println("2. Light exercise (Exercise 1-3 times/week)");
			    System.out.println("3. Exercise 4-5 times/week");
			    System.out.println("4. Daily exercise or intense exercise 3-4 times/week");
			    System.out.println("5. Very heavy exercise (twice per day, extra heavy workouts)");
			    System.out.print("Enter your choice: ");
			    int activity = sc.nextInt();
				System.out.println(new CalorieCalculator().calculate(age, gender, h, w, activity));
				System.out.println();
				break;
			case 4:
				System.out.println("The Ideal Weight Calculator computes ideal body weight (IBW) ranges based on height, gender, and age. The idea of finding the IBW using a formula has been sought after by many experts for a long time. Currently, there persist several popular formulas, and our Ideal Weight Calculator provides their results for side-to-side comparisons.");
				System.out.println("Age (2-80): ");
				int age1 = sc.nextInt();
				System.out.println("Gender (M/F): ");
				char gender1 = sc.next().charAt(0);
				System.out.println("Height (in cm): ");
				double height1 = sc.nextDouble();
				System.out.println(new IdealWeightCalculator().calculate(age1,gender1,height1));
				System.out.println();
				break;
			case 5:
				System.out.println("The Lean Body Mass Calculator computes a person's estimated lean body mass (LBM) based on body weight, height, gender, and age. For comparison purposes, the calculator provides the results of multiple formulas.\n");
				System.out.println("Gender (M/F): ");
				gender = sc.next().charAt(0);
				System.out.println("Age - 14 or younger? (Y/N): ");
				char younger = sc.next().charAt(0);
				System.out.println("Height (in cm): ");
				height = sc.nextDouble();
				System.out.println("Weight (in kg): ");
				weight = sc.nextDouble();
				System.out.println(new LeanBodyMassCalculator().calculate(younger, gender, height, weight));
				System.out.println();
				break;

			case 6:
				System.out.println("DIET CHART PROVIDED BY US!!!!");

				System.out.println("Meal 1: Wake-Up Meal/Pre-Breakfast");
				System.out.println("What to Eat:" +
						"This meal remains same for both vegetarians and non-vegetarians. A glass of protein shakes along with a medium sized fruit, preferably banana.");

				System.out.println("Meal 2: Breakfast\n" +
						"Nutrient Groups: Protein + Low GI carbs + Healthy Fats");
				System.out.println("What to Eat:\n" +
						"Vegetarians: Parantha (3 medium pieces)/Paneer Bhurji + Greek Yogurt/ Low-fat yogurt + sprout salad (1 medium bowl)\n" +
						"Non-Vegetarians: Eggs, Oatmeal, Milk, and Nuts");

				System.out.println("Meal 3: Mid-Morning Meal\n" +
						"Nutrient Groups: Protein + Slow acting carbs + Veggies");
				System.out.println("What to Eat:\n" +
						"Vegetarians: Roasted chickpeas (1 medium bowl) + Small size fruit + mixed vegetables salad\n" +
						"Non-Vegetarians: A bowl of Brown Rice, Chicken, and Broccoli");

				System.out.println("Meal 4: Lunch\n" +
						"Nutrient Groups: Protein + Slow acting carbs + Veggies");
				System.out.println("What to eat:\n" +
						"Vegetarians: Mixed veggies sabzi + Brown Rice (1 medium cup) + Broccoli/Cauliflower (1 cup cooked)\n" +
						"Non-Vegetarians: Fish, Brown Rice, Mixed Veggies");

				System.out.println("Meal 5: Mid-Afternoon/Pre-Workout Meal\n" +
						"Nutrient Groups: Protein + Low GI carbs");
				System.out.println("What to eat:\n" +
						"Vegetarians: Whole grain toast with almond butter or avocado + Baked sweet potatoes (1 small bowl)\n" +
						"Non-Vegetarians: Sweet potato and Protein powder");

				System.out.println("Meal 6: Post-Workout Shake\n" +
						"Nutrient Groups: Fast Protein + Fast Carbs/High GI Carbs");
				System.out.println("What to eat:\n" +
						"Vegetarians & Non-Vegetarians: Whey protein shake and Dextrose Monohydrate.");


				System.out.println("Meal 7: Dinner\n" +
						"Nutrient Groups: Protein + Fibres + Few Low GI carbs");
				System.out.println("What to eat:\n" +
						"Vegetarians: Avocado and White Bean Salad with cheese dressing\n" +
						"Non-Vegetarians: Chicken, Broccoli salad with flax oil dressing");

				System.out.println("Meal 8: Bedtime Meal\n" +
						"Nutrient Groups: Slow acting protein + healthy fats");
				System.out.println("What to eat:\n" +
						"Vegetarians & Non-vegetarians: Whey protein with paneer or casein protein + ½ spoon peanut butter");

				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();


				break;


			case 7:
				System.out.println("Body fat includes essential body fat and storage body fat. Essential body fat is a base level of fat that is found in most parts of the body. \n It is necessary fat that maintains life and reproductive functions. The amount of essential fat differs between men and women, and is typically around 2-5% in men, and 10-13% in women. The healthy range of body fat for men is typically defined as 8-19%, while the healthy range for women is 21-33%. While having excess body fat can have many detrimental effects on a person's health, insufficient body fat can have negative health effects of its own, and maintaining a body fat percentage below, or even at the essential body fat percentage range is a topic that should be discussed with a medical professional.\n");
				System.out.println("Gender (M/F): " );
				gender = sc.next().charAt(0);
				System.out.println("Age (15-80): ");
				age = sc.nextInt();
				System.out.println("Height (cm): ");
				h = sc.nextDouble();
				System.out.println("Weight (kg): ");
				w = sc.nextDouble();
				System.out.println("Neck (cm): ");
				System.out.println("Measure the circumference of the subject's neck starting below the larynx, with the tape sloping downward to the front. The subject should avoid flaring their neck outwards.");
				double neck = sc.nextDouble();
				System.out.println("Waist (cm): ");
				System.out.println("Measure the circumference of the subject's waist at a horizontal level around the navel for men, and at the level with the smallest width for women. Ensure that the subject does not pull their stomach inwards to obtain accurate measurements.");
				double waist = sc.nextDouble();
				System.out.println("Hip (cm): ");
				System.out.println("Measure the circumference of the subject's hips at the largest horizontal measure.");
				double hip = sc.nextDouble();

				String fat= new BodyFatCalculator().calculate(gender, w, h, neck, waist, hip);
				System.out.println(new BodyFatCalculator().calculate(gender, w, h, neck, waist, hip));
				break;



			default:
				System.out.println("Sorry! Cant be processed!");
				System.out.println();
				break;
			}
	    	choice = getChoice();
	    }
    }
	
	public static int getChoice() {
		System.out.println("1. Calculate BMI");
		System.out.println("2. Calculate BMR");
		System.out.println("3. Know calories per exercise");
		System.out.println("4. Know your Ideal Weight");
		System.out.println("5. Know your Lean Body Mass");
		System.out.println("6. Get your detailed Diet Plan");

		System.out.println("7. Lets start STEP 2: Will suggest Exercises, based on your FAT COUNT");
		System.out.println("8. Exit");
		System.out.println();

		System.out.print("Select option: GO FOR IT");
	    Scanner scanner = new Scanner(System.in);
	    int choice = scanner.nextInt();
	    return choice;
	}
}