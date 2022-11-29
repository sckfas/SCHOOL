package week4;

import java.util.Scanner;

public class ShirtSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Using Scanner for getting Input from user
	     Scanner in = new Scanner(System.in);

	     System.out.println("Please enter the customer's chest measurement in inches: ");
	     String input = in.nextLine();					  // Store data in variable input
	     int chestSize = Integer.parseInt(input);         // Convert string to Integer and assign to int variable chestSize 
	     
	     if (chestSize < 38) {                            // True if chestSize is less than 38 inches.
	    	 System.out.println("A customer with a chest measurement of " + chestSize + " needs to order a size S.");
	     } else if (chestSize >= 38 && chestSize < 40 ) { // True if chestSize is greater than or equal to 38 inches and less than 40 inches.
	    	 System.out.println("A customer with a chest measurement of " + chestSize + " needs to order a size M.");	    	 
	     } else if (chestSize >= 40 && chestSize < 43) {  // True if chestSize is greater than or equal to 40 inches and less than 43 inches
	    	 System.out.println("A customer with a chest measurement of " + chestSize + " needs to order a size L.");
	     } else if (chestSize >= 43 && chestSize < 46) {  // True if chestSize is greater than or equal to 43 inches and less than 46 inches.
	    	 System.out.println("A customer with a chest measurement of " + chestSize + " needs to order a size XL.");	    	 
	     } else {                                         //True if none of the above conditions are true
	    	 System.out.println("A customer with a chest measurement of " + chestSize + " needs to order a size XXL.");	
	     }
 	}

}
