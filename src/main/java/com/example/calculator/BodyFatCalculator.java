package com.example.calculator;

public class BodyFatCalculator {

	//this program calculates fat percentage for men
	public double calculateFat(double w, double h, double neck, double waist) {
		double fatPercent;
		if(w > 0 && h > 0 && neck > 0 && waist > 0)
			fatPercent = (495 / (1.0324 - 0.19077*Math.log10(waist-neck) + 0.15456*Math.log10(h))-450);
		else
			fatPercent = -1;
    	return fatPercent;
	}
	
	//this program calculates fat percentage for women
	public double calculateFat(double w, double h, double neck, double waist, double hip) {
		double fatPercent;
		if(w > 0 && h > 0 && neck > 0 && waist > 0 && hip > 0)
			fatPercent = (495 / (1.29579 - 0.35004*Math.log10(waist+hip-neck) +  0.22100*Math.log10(h))) - 420;
		else
			fatPercent = -1;
		
		return fatPercent;
	}
	
	public String calculate(char gender,double weight, double height, double neck, double waist, double hip)
    {
		double fat = -1;
		if(gender == 'F' || gender == 'f') {

			//calculates fat
	    	fat = calculateFat(weight, height, neck, waist);

	    	if(fat == -1 || fat < 2)
	    		return "Invalid Inputs";
	    	else if (fat >= 2 && fat <= 5) {
				System.out.println("Incredible, you are LEAN, lets suggest some hard exercises");
				System.out.println("1. Rear-Foot-Elevated Split Squat (a.k.a. Bulgarian Split Squat)");
				System.out.println("How to do it: Stand a couple of feet from a bench or other padded surface that’s approximately knee height, with your back to it. Bend your right leg and rest the top of your right foot on the bench. This is the starting split squat position.\n" +
						"\n" +
						"Pushing through your front heel, bend your left leg and lower your body down toward the floor.  Your left leg should be bent at least 90 degrees. Push back up to the starting position. Use your back leg only as necessary.\n" +
						"\n" +
						"A little forward lean during the movement can help hammer your glutes even more than an upright stance, making the exercise easier on your lower back.");
				System.out.println();

				System.out.println("2. Anderson Squat");
				System.out.println("How to do it: To prepare for an Anderson squat, set the safety pins to a height that matches up with your shoulders at the bottom position of your squat for either a barbell front or back squat. Place the barbell on the pins and get under the bar.\n" +
						"\n" +
						"If you want to perform a back squat, the bar goes across your upper back. If you want to perform a front squat, it goes in a racked position in front of your chest. This is the starting position.\n" +
						"\n" +
						"From there, stand up with the bar, and then squat back down to the pins. Pause for 4 seconds before standing up again.");
				System.out.println();
				System.out.println();

				System.out.println("3. Romanian Deadlift");
				System.out.println("How to do it: If you’re using a pair of dumbbells or kettlebells, let the weights hang at your sides at arms’ length. If you’re using a barbell, grab it with an overhand grip and let the load hang in front of your quads at arms’ length. Bend your knees slightly.");
				System.out.println();
				System.out.println();
				System.out.println();

	          return "Essential fat. Fat percentage: " + fat;
		    } else if (fat >= 6 && fat <= 13) {

				System.out.println("YOU HAVE AN ATHLETIC BODY");
				System.out.println("1.POWER CLEANS ");
				System.out.println("Many athletes are always looking for ways to become more explosive on the field. As such, an excellent athletic exercise is power cleans. This exercise is similar to deadlifts and requires the use of a barbell and weight plates. \n power clean movement requires someone to lift the barbell under their shoulders while jumping. Doing this exercise often \n is a sure way to make any athlete faster.\n\n ");
				System.out.println();

				System.out.println("2.LANDMINES ");
				System.out.println("Another great exercise for any athlete is landmines. This exercise also \n utilizesa barbell with weights. There are also many different exercises you can perform,\nsuch as a two-handed landmine shoulder press, a landmine front squat, a one-arm bent over row landmine row, and more. Any landmine exercise will be an excellent full-body workout for an athlete.\n\n");
				System.out.println();

				System.out.println("3.BENCH PRESS");
				System.out.println("The bench press is a staple of working out, and athletes utilize the exercise to become stronger. This workout requires a barbell and a flat bench. Whoever is doing the workout must bring the barbell towards their chest and continue moving in an up and down movement.\n\n");
				System.out.println();

		          return "Athletes. Fat percentage: " + fat;
		    } else if (fat >= 14 && fat <= 17) {

				System.out.println("YOU ARE A FIT PERSON");

				System.out.println("1.INTERVAL TRAINING");
				System.out.println("The way to do it is to push the intensity or pace for a minute or two, then back off for anywhere from two to -10 minutes (depending on how long your total workout will be, and how much time you need to recover). Continue doing this throughout the workout.");
				System.out.println();

				System.out.println("2. Lunges");
				System.out.println("Here's how to do them right: Take a big step forward, keeping your spine in a neutral position. Bend your front knee to approximately 90 degrees, focusing on keeping weight on the back toes and dropping the knee of your back leg toward the floor.");
				System.out.println();

				System.out.println("3. ABDOMINAL CRUNCHES");
				System.out.println("For a standard crunch, says Cotton, begin lying on your back with feet flat on the floor and fingertips supporting your head. Press your low back down and begin the exercise by contracting abdominals and peeling first your head (tucking your chin slightly), then your neck, shoulders, and upper back off the floor.");
				System.out.println();

		          return "Fitness. Fat percentage: " + fat;
		    } else if (fat >= 18 && fat <= 25) {

				System.out.println("YOU ARE AN AVERAGE PERSON! TRY WORKING OUT WITH US");

				System.out.println("1.PUSHUPS");
				System.out.println("Start in a plank position. Your core should be tight, shoulders pulled down and back, and your neck neutral.\n" +
						"Bend your elbows and begin to lower your body down to the floor. When your chest grazes it, extend your elbows and return to the start. Focus on keeping your elbows close to your body during the movement.\n" +
						"Complete 3 sets of as many reps as possible.");
				System.out.println();

				System.out.println("2.SQUATS");
				System.out.println("Start by standing straight, with your feet slightly wider than shoulder-width apart, and your arms at your sides.\n" +
						"Brace your core and, keeping your chest and chin up, push your hips back and bend your knees as if you’re going to sit in a chair.\n" +
						"Ensuring your knees don’t bow inward or outward, drop down until your thighs are parallel to the ground, bringing your arms out in front of you in a comfortable position. Pause for 1 second, then extend your legs and return to the starting position.");
				System.out.println();

				System.out.println("3.STANDING OVERHEAD DUMBBELL PRESS");
				System.out.println("Pick a light set of dumbbells — we recommend 10 pounds to start — and start by standing, either with your feet shoulder-width apart or staggered. Move the weights overhead so your upper arms are parallel to the floor.\n" +
						"Bracing your core, begin to push up until your arms are fully extended above your head. Keep your head and neck stationary.\n" +
						"After a brief pause, bend your elbows and lower the weight back down until your triceps muscle is parallel to the floor again.\n" +
						"Complete 3 sets of 12 reps.");
				System.out.println();

		          return "Average Fit. Fat percentage: " + fat;
		    } else if (fat > 25) {

				System.out.println("YOU ARE OBESE :( ! BUT DONT WORRY, WE GOT YOUR BACK");

				System.out.println("The American Heart Association (AHA) at least 150 minutes every week of moderate exercise, or 75 minutes every week of vigorous exercise. That can be broken down into 30 minutes of exercise, five days a week.\n" +
						"\n" +
						"For an overweight beginner, that can seem like a lot. But it’s important that you see this recommendation as a goal to which you can work. If you’re physically unable to complete 30 minutes of exercise this week, do what you can, and build toward 30 minutes daily over time. In fact, three bouts of 10 minutes of exercise a day adds up to the same calorie expenditure as a continuous 30 minutes.\n" +
						"\n" +
						"In the beginning, it doesn’t even matter if your exercise sessions are so short that they aren’t contributing significantly to calories burned. All that matters in the beginning is that you’re doing what you’re capable of doing. That’s how to begin preparing your body for longer workout sessions in the future.\n" +
						"\n" +
						"You’ll still experience the benefits of fitness if you break those 30 minutes into two or three groups of 10 to 15 minutes throughout the course of the day. When you begin, don’t allow yourself to get hung up on the clock. Instead, focus on picking an activity that you enjoy and that can fit into your schedule at least three to five days a week.\n" +
						"\n" +
						"To increase your chances of successfully sticking to your program, try to schedule it for the same time each day, such as in the morning or right after work. The idea is to repeat the behavior until it becomes a habit.");

				System.out.println("1.Walking");
				System.out.println("Not only is it free, it’s a low-impact exercise that you can do nearly anywhere, inside or out. For people who have morbid obesity, walking may be difficult. But it’s doable with assistance. Even walking slowly will burn additional calories when you’re carrying extra weight, because you’re exerting more energy to move your body.");
				System.out.println();

				System.out.println("2.Water Aerobics");
				System.out.println("Water helps to support your body weight, which makes you feel lighter. It also reduces the impact on your joints, which means that the pain you might feel in your hips or knees from moving on land is virtually nonexistent when you stand in the water.");
				System.out.println();


				System.out.println("3.STATIONARY BIKE");
				System.out.println("Some people with obesity lack a strong abdominal core, which makes it difficult to sit on an upright stationary bike. Seated bikes are also less stressful on the lower spine, which is a common complaint for people carrying extra weight.");
				System.out.println();

		          return "Obese. Fat percentage: " + fat;
		    }
		} else if (gender == 'M' || gender == 'm') {
			fat = calculateFat(weight, height , neck, waist);
	    	if(fat == -1 || fat < 10)
	    		return "Invalid Inputs";
	    	else if (fat >= 10 && fat <= 13) {

				System.out.println("Incredible, you are LEAN, lets suggest some hard exercises");
				System.out.println("1. Rear-Foot-Elevated Split Squat (a.k.a. Bulgarian Split Squat)");
				System.out.println("How to do it: Stand a couple of feet from a bench or other padded surface that’s approximately knee height, with your back to it. Bend your right leg and rest the top of your right foot on the bench. This is the starting split squat position.\n" +
						"\n" +
						"Pushing through your front heel, bend your left leg and lower your body down toward the floor.  Your left leg should be bent at least 90 degrees. Push back up to the starting position. Use your back leg only as necessary.\n" +
						"\n" +
						"A little forward lean during the movement can help hammer your glutes even more than an upright stance, making the exercise easier on your lower back.");
				System.out.println();

				System.out.println("2. Anderson Squat");
				System.out.println("How to do it: To prepare for an Anderson squat, set the safety pins to a height that matches up with your shoulders at the bottom position of your squat for either a barbell front or back squat. Place the barbell on the pins and get under the bar.\n" +
						"\n" +
						"If you want to perform a back squat, the bar goes across your upper back. If you want to perform a front squat, it goes in a racked position in front of your chest. This is the starting position.\n" +
						"\n" +
						"From there, stand up with the bar, and then squat back down to the pins. Pause for 4 seconds before standing up again.");
				System.out.println();
				System.out.println();

				System.out.println("3. Romanian Deadlift");
				System.out.println("How to do it: If you’re using a pair of dumbbells or kettlebells, let the weights hang at your sides at arms’ length. If you’re using a barbell, grab it with an overhand grip and let the load hang in front of your quads at arms’ length. Bend your knees slightly.");
				System.out.println();
				System.out.println();
	          	return "Essential fat. Fat percentage: " + fat;
		    } else if (fat >= 14 && fat < 20) {

				System.out.println("YOU HAVE AN ATHLETIC BODY");
				System.out.println("1.POWER CLEANS ");
				System.out.println("Many athletes are always looking for ways to become more explosive on the field. As such, an excellent athletic exercise is power cleans. This exercise is similar to deadlifts and requires the use of a barbell and weight plates. \n power clean movement requires someone to lift the barbell under their shoulders while jumping. Doing this exercise often \n is a sure way to make any athlete faster.\n\n ");
				System.out.println();

				System.out.println("2.LANDMINES ");
				System.out.println("Another great exercise for any athlete is landmines. This exercise also \n utilizesa barbell with weights. There are also many different exercises you can perform,\nsuch as a two-handed landmine shoulder press, a landmine front squat, a one-arm bent over row landmine row, and more. Any landmine exercise will be an excellent full-body workout for an athlete.\n\n");
				System.out.println();

				System.out.println("3.BENCH PRESS");
				System.out.println("The bench press is a staple of working out, and athletes utilize the exercise to become stronger. This workout requires a barbell and a flat bench. Whoever is doing the workout must bring the barbell towards their chest and continue moving in an up and down movement.\n\n");
				System.out.println();

		          return "Athletes. Fat percentage: " + fat;
		    } else if (fat >= 21 && fat < 24) {

				System.out.println("YOU ARE A FIT PERSON");

				System.out.println("1.INTERVAL TRAINING");
				System.out.println("The way to do it is to push the intensity or pace for a minute or two, then back off for anywhere from two to -10 minutes (depending on how long your total workout will be, and how much time you need to recover). Continue doing this throughout the workout.");
				System.out.println();

				System.out.println("2. Lunges");
				System.out.println("Here's how to do them right: Take a big step forward, keeping your spine in a neutral position. Bend your front knee to approximately 90 degrees, focusing on keeping weight on the back toes and dropping the knee of your back leg toward the floor.");
				System.out.println();

				System.out.println("3. ABDOMINAL CRUNCHES");
				System.out.println("For a standard crunch, says Cotton, begin lying on your back with feet flat on the floor and fingertips supporting your head. Press your low back down and begin the exercise by contracting abdominals and peeling first your head (tucking your chin slightly), then your neck, shoulders, and upper back off the floor.");
				System.out.println();
		          return "Fitness. Fat percentage: " + fat;
		    } else if (fat >= 25 && fat <= 31) {

				System.out.println("YOU ARE AN AVERAGE PERSON! TRY WORKING OUT WITH US");

				System.out.println("1.PUSHUPS");
				System.out.println("Start in a plank position. Your core should be tight, shoulders pulled down and back, and your neck neutral.\n" +
						"Bend your elbows and begin to lower your body down to the floor. When your chest grazes it, extend your elbows and return to the start. Focus on keeping your elbows close to your body during the movement.\n" +
						"Complete 3 sets of as many reps as possible.");
				System.out.println();

				System.out.println("2.SQUATS");
				System.out.println("Start by standing straight, with your feet slightly wider than shoulder-width apart, and your arms at your sides.\n" +
						"Brace your core and, keeping your chest and chin up, push your hips back and bend your knees as if you’re going to sit in a chair.\n" +
						"Ensuring your knees don’t bow inward or outward, drop down until your thighs are parallel to the ground, bringing your arms out in front of you in a comfortable position. Pause for 1 second, then extend your legs and return to the starting position.");
				System.out.println();

				System.out.println("3.STANDING OVERHEAD DUMBBELL PRESS");
				System.out.println("Pick a light set of dumbbells — we recommend 10 pounds to start — and start by standing, either with your feet shoulder-width apart or staggered. Move the weights overhead so your upper arms are parallel to the floor.\n" +
						"Bracing your core, begin to push up until your arms are fully extended above your head. Keep your head and neck stationary.\n" +
						"After a brief pause, bend your elbows and lower the weight back down until your triceps muscle is parallel to the floor again.\n" +
						"Complete 3 sets of 12 reps.");
				System.out.println();
		          return "Average Fit. Fat percentage: " + fat;
		    } else if (fat > 31) {

				System.out.println("YOU ARE OBESE :( ! BUT DONT WORRY, WE GOT YOUR BACK");

				System.out.println("The American Heart Association (AHA) Trusted Sourcerecommends at least 150 minutes every week of moderate exercise, or 75 minutes every week of vigorous exercise. That can be broken down into 30 minutes of exercise, five days a week.\n" +
						"\n" +
						"For an overweight beginner, that can seem like a lot. But it’s important that you see this recommendation as a goal to which you can work. If you’re physically unable to complete 30 minutes of exercise this week, do what you can, and build toward 30 minutes daily over time. In fact, three bouts of 10 minutes of exercise a day adds up to the same calorie expenditure as a continuous 30 minutes.\n" +
						"\n" +
						"In the beginning, it doesn’t even matter if your exercise sessions are so short that they aren’t contributing significantly to calories burned. All that matters in the beginning is that you’re doing what you’re capable of doing. That’s how to begin preparing your body for longer workout sessions in the future.\n" +
						"\n" +
						"You’ll still experience the benefits of fitness if you break those 30 minutes into two or three groups of 10 to 15 minutes throughout the course of the day. When you begin, don’t allow yourself to get hung up on the clock. Instead, focus on picking an activity that you enjoy and that can fit into your schedule at least three to five days a week.\n" +
						"\n" +
						"To increase your chances of successfully sticking to your program, try to schedule it for the same time each day, such as in the morning or right after work. The idea is to repeat the behavior until it becomes a habit.");

				System.out.println("1.Walking");
				System.out.println("Not only is it free, it’s a low-impact exercise that you can do nearly anywhere, inside or out. For people who have morbid obesity, walking may be difficult. But it’s doable with assistance. Even walking slowly will burn additional calories when you’re carrying extra weight, because you’re exerting more energy to move your body.");
				System.out.println();

				System.out.println("2.Water Aerobics");
				System.out.println("Water helps to support your body weight, which makes you feel lighter. It also reduces the impact on your joints, which means that the pain you might feel in your hips or knees from moving on land is virtually nonexistent when you stand in the water.");
				System.out.println();


				System.out.println("3.STATIONARY BIKE");
				System.out.println("Some people with obesity lack a strong abdominal core, which makes it difficult to sit on an upright stationary bike. Seated bikes are also less stressful on the lower spine, which is a common complaint for people carrying extra weight.");
				System.out.println();
		          return "Obese. Fat percentage: " + fat;
		    }
		}	
    	return "Invalid Inputs";
    }
	

}
