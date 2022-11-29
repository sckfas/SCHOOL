package week4;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// double kg = Integer.parseInt(0.45359237);
		

		// Using Scanner for getting Input from user
	     Scanner in = new Scanner(System.in);
	     System.out.println("In this program we will calculate a person's BMI.");
	     System.out.println();
	     System.out.println("Please enter a person's height in inches: ");
	     double heightIN = Integer.parseInt(in.nextLine());					  														// Store data in variable heightIN
	     double heightM = (double) (heightIN*0.0254);       																		// Convert height in inches to height in meters 
	     System.out.println("Please enter a person's weight in pounds: ");
	     double weightLBS = Integer.parseInt(in.nextLine());					  													// Store data in variable weightLBS
	     double weightKG = (double) (weightLBS*0.45359237);	     																	// Convert weight in pounds to weight in kilograms.
	     double BMI = weightKG/(heightM*heightM);

	     // Determine BMI classification based on the BMI number
	     if (BMI < 18.5) {                            																				// True if BMI is less than 18.5.
	    	 System.out.println("The person's BMI is: " + BMI + " The person has a BMI classification of: " + "Underweight.");
	     } else if (BMI >= 18.5 && BMI < 24.9 ) { 																					// True if BMI is greater than or equal to 18.5 and less than 24.9.
	    	 System.out.println("The person's BMI is: " + BMI + " The person has a BMI classification of: " + "Normal.");	    	 
	     } else if (BMI >= 25.0 && BMI < 29.9) {  																					// True if BMI is greater than or equal to 25.0 and less than 29.9.
	    	 System.out.println("The person's BMI is: " + BMI + " The person has a BMI classification of: " + "Overweight.");
	     } else {                                         																			//True if none of the above conditions are true, greater than or equal to 30.0.
	    	 System.out.println("The person's BMI is: " + BMI + " The person has a BMI classification of: " + "Obese.");	
	     }
	
	}
}
