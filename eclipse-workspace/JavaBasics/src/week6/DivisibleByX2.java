package week6;

import java.util.*;

public class DivisibleByX2 {

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
					startingNum = Integer.parseInt(input);         // Convert string to Integer and assign to int variable chestSize
					valid = true;
				}catch(Exception e) {
					System.out.println("Invalid Response! Please enter a whole number.\n");
				} // End Try Catch first Do loop
			} while(!valid); 

			// Question two validation			
			do {//Start first nested Do loop
				valid = false;
				System.out.print("Please enter an ending number:\n");
				input = in.nextLine();
				try { //Start Do Try first nested Do loop
					endingNum = Integer.parseInt(input);         // Convert string to Integer and assign to int variable chestSize
					valid = true;
				}catch(Exception e) {
					System.out.println("Invalid Response! Please enter a whole number.\n");
				}//End Try Catch first nested Do loop
			} while(!valid);

			// Question three validation
			do {//Start Second nested Do loop
				valid = false;
				System.out.print("Please enter an test number:\n");
				input = in.nextLine();
				try {//Start Do Try second nested Do loop
					testNum = Integer.parseInt(input);         // Convert string to Integer and assign to int variable chestSize
					valid = true;
				}catch(Exception e) {
					System.out.println("Invalid Response! Please enter a whole number.\n");
				}//End Do Try second nested Do loop
			} while(!valid);



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