package week6;

import java.util.Scanner;

public class ImprovedInterest {
	
	public static void main(String[] args) { //Start public static void
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String input = "";

		double deposit = 0;
		double interest = 0;
		int period = 0;
		Boolean valid = false;
		Boolean playAgain = true;
		
		do {

			// Question one validation
			do { //Start Do loop
				System.out.print("Please enter the amount to be deposited each month:\n");
				input = in.nextLine();
				try { //Start Do Try first Do loop
					deposit = Double.parseDouble(input);         // Convert string to double
					valid = true;
				}catch(Exception e) {
					System.out.println("Invalid Response! Please enter a whole number.\n");
				} // End Try Catch first Do loop
			} while(!valid); 

			// Question two validation			
			do {//Start second Do loop
				valid = false;
				System.out.print("Please enter the annual interest rate:\n");
				input = in.nextLine();
				try { //Start Do Try second Do loop
					interest = Double.parseDouble(input);         // Convert string to double
					valid = true;
				}catch(Exception e) {
					System.out.println("Invalid Response! Please enter a whole number.\n");
				}//End Try Catch second Do loop
			} while(!valid);

			// Question three validation
			do {//Start third Do loop
				valid = false;
				System.out.print("Please enter the number of period you plan to save:\n");
				input = in.nextLine();
				try {//Start Do Try third Do loop
					period = Integer.parseInt(input);         // Convert string to Integer
					valid = true;
				}catch(Exception e) {
					System.out.println("Invalid Response! Please enter a whole number.\n");
				}//End Do Try third Do loop
			} while(!valid);

				// Start output
				
				double month = interest/100/12;
			
				System.out.printf("The following table shows the balance of the account for each month of the designated savings period.%n");
				System.out.printf("Month %12s %n", "Balance");
				
				double balance = deposit * (1 + month);

				for (int i = 1; i <= period; i++) {
					
					System.out.printf("Month: %-2s  $%,2.2f %n", i, balance);
					balance = (deposit + balance) * (1 + month);
					
				}// End for loop
				
				// Play again validation
				do {
					System.out.println("Would you like to play again? (Y/N):");
					input = in.nextLine();	
					if (input.equalsIgnoreCase("y")) {
						playAgain=true;
					}else if (input.equalsIgnoreCase("n")) {
						playAgain = false;
					}else System.out.println("Invalid response! Please answer 'Y' or 'N'\n");
				}
				while(!(input.equalsIgnoreCase("Y") || input.equalsIgnoreCase("N")));

		} while(playAgain);
		in.close();

	}//End public static void
}//End public class

// ORIGINAL CODE
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//	     // Using Scanner for getting Input from user
//	     Scanner in = new Scanner(System.in);
//
//	     //Ask the user for amount to deposit each month
//	     System.out.println("Please enter your monthly deposit: ");
//	     int deposit = Integer.parseInt(in.nextLine());
//	     // System.out.println("Your monthly deposit is " + deposit);
//
//
//	     //Ask the user the for the annual interest rate
//	     System.out.println("Please enter the annual interest rate: ");
//	     double interest = Integer.parseInt(in.nextLine());
//	     double month = interest/100/12;
//	     System.out.println();
//	     
//	     // System.out.println("The monthly interest is  " + month*100 + "%");
//	     
//	     // Calculating saving and interest over six period
//	     double balance = deposit * (1 + month);        // First month
//	     balance = (deposit + balance) * (1 + month);	// Second month
//	     balance = (deposit + balance) * (1 + month);	// Third month
//	     balance = (deposit + balance) * (1 + month);	// Fourth month
//	     balance = (deposit + balance) * (1 + month);	// Fifth month
//	     balance = (deposit + balance) * (1 + month);	// Sixth month
//	     System.out.println("The ending balance after 6 months is $ " + balance);
//	     System.out.println();     
//		
//	}
//
//}