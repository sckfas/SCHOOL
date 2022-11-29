package week4;

import java.util.Scanner;

public class SundaySchool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Using Scanner for getting Input from user
		
	     Scanner in = new Scanner(System.in);
	     
	     System.out.println("This program will ask a member's age and gender and determine which class they should attend on Sunday.");
	     System.out.println();
	     System.out.println("Please enter the member's age: ");
	     int age = Integer.parseInt(in.nextLine());									// Define integer variable and assign the value of input
	     
	     if (age < 1) {																// True if less than 1
	    	 System.out.println("The member is a Babe in Arms");
	     } else if (age >= 1 && age < 3) {											// True if greater than or equal to 1 and less than 3
	    	 System.out.println("The member should be in Nursery");
	     } else if (age >= 3 && age < 12) {											// True if greater than or equal to 3 and less than 12
	    	 System.out.println("The member should attend Primary");
	     } else if (age >= 12 && age < 18) {										// True if greater than or equal to 12 and less than 18
		     System.out.println("Please enter the member's gender: ");
		     String gender = in.nextLine();											// Define string value and assign the value of input
		     if (gender.equalsIgnoreCase("m")) {									// True if gender is "m" or "M" ignoring case
		    	 System.out.println("The member should attend Young Men's");
		     } else 																// Executes when 'f' or 'F' is entered (no validation check)
		     	System.out.println("The member should attend Young Women's");
	     } else {																	// Executes if all above are false or greater than or equal to 18
		     System.out.println("Please enter the member's gender: ");
		     String gender = in.nextLine();											// Define string value and assign the value of input
		     if (gender.equalsIgnoreCase("m")) {									// True if gender is "m" or "M" ignoring case
		    	 System.out.println("The member should attend Elder's Quorum");
		     } else 																// Executes when "f" or "F" is entered (no validation check)e
		     	System.out.println("The member should attend Relief Society");
	     }
	}
}