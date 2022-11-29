package week6;

import java.util.*;

public class DivisibleByX { //Start public class

	public static void main(String[] args) { //Start public static void
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String input = "";

		int startingNum = 0;
		int endingNum = 0;
		int testNum = 0;

		Boolean valid = false;
		Boolean playAgain = true;

		do {

			// Question one validation
			do { //Start Do loop
				System.out.print("Please enter a starting number:\n");
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
				System.out.print("Please enter an ending number:\n");
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
				System.out.print("Please enter an test number:\n");
				input = in.nextLine();
				try {//Start Do Try third Do loop
					testNum = Integer.parseInt(input);         
					valid = true;
				}catch(Exception e) {
					System.out.println("Invalid Response! Please enter a whole number.\n");
				}//End Do Try third Do loop
			} while(!valid);

				// Start output

				System.out.println("startingNum = " + startingNum);
				System.out.println("endingNum = " + endingNum);
				System.out.println("testNum = " + testNum);
				System.out.println("Here are the numbers between " + startingNum + " and " + endingNum + " that are divisible by " + testNum);	

				for (int i = startingNum; i <= endingNum; i++) {
					int m = i % testNum;
					if (m != 0) {
						continue;
					}
					System.out.println(i);
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