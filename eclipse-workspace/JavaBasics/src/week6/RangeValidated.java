package week6;

import java.util.*;

public class RangeValidated {

	public static void main(String[] args) { //Start public static void
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String input = "";

		int startingNum = 0;
		int endingNum = 0;
		int multiplier = 0;

		Boolean valid = false;
		Boolean playAgain = true;

		do {
			System.out.println("This program will ask the user for three numbers:\r\n"
					+ "    * A starting number\r\n"
					+ "    * An ending number\r\n"
					+ "    * A multiplier\r\n"
					+ "The program will multiply each number between the starting number and ending number by the multiplier.\n");

			// Question one validation
			do { //Start first Do loop
				System.out.print("Please enter a starting number: ");
				input = in.nextLine();
				try { //Start Do Try first Do loop
					startingNum = Integer.parseInt(input);         
					valid = true;
				}catch(Exception e) {
					System.out.println("Invalid Response! Please enter a whole number.\n");
				} // End Try Catch first Do loop
			} while(!valid); 

			// Question two validation			
			do {//Start second Do loop
				valid = false;
				System.out.print("Please enter an ending number: ");
				input = in.nextLine();
				try { //Start Do Try second Do loop
					endingNum = Integer.parseInt(input);         
					valid = true;
				}catch(Exception e) {
					System.out.println("Invalid Response! Please enter a whole number.\n");
				}//End Try Catch second Do loop
			} while(!valid);

			// Question three validation
			do {//Start third Do loop
				valid = false;
				System.out.print("Please enter the multiplier: ");
				input = in.nextLine();
				try {//Start Do Try third Do loop
					multiplier = Integer.parseInt(input);         
					valid = true;
				}catch(Exception e) {
					System.out.println("Invalid Response! Please enter a whole number.\n");
				}//End Do Try third Do loop
			} while(!valid);

			System.out.println("");
			
			//Start For Loop
			for (int i = startingNum; i <= endingNum; i++) {
				System.out.println("Multiplying " + i + " by " + multiplier + " results in " + (i*multiplier));
			}// End for loop
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