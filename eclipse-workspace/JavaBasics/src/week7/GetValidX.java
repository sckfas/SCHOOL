package week7;

import java.util.*;

public class GetValidX {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		//Play the game until the user says they don't want to play again.
		String playAgain = "Y";
		while (playAgain.equalsIgnoreCase("Y")) {

		//Get an integer from the user
		int intNum = getValidInt(in, "Please enter a whole number: ", "Invalid Response! Please enter a whole number.");
		System.out.printf("The whole number your entered was: %d.%n", intNum);
		System.out.println("Now we will test your whole number in a math equation...");
		System.out.printf("Adding 10 to your whole number would be: 10 + %d = %d.%n", intNum, intNum + 10);
		System.out.println();

		//Get a floating-point from the user
		double doubleNum = getValidDouble(in, "Please enter a decimal-point number: ", "Invalid Response! Please enter a number.");
		System.out.printf("The float your entered was: %f.%n", doubleNum);
		System.out.println("Now we will test your floating-point number in a math equation...");
		System.out.printf("Adding 10 to your float would be: 10 + %f = %f.%n", doubleNum, doubleNum + 10);
		System.out.println();

		//Get a 'Y' or 'N' from the user
		playAgain = getValidYN(in, "Would you like to play again? (Y/N): ", "Invalid Response! Please answer with a 'Y' or 'N'");
		System.out.println();
		}// end of while (playAgain.equalsIgnoreCase("y"))
		}

	private static int getValidInt(Scanner in, String ask1, String string1) {
		// TODO Auto-generated method stub
		int intNum = 0;
		boolean intNumberValid = false;

		do {
			System.out.println(ask1);
			try {
				intNum= Integer.parseInt(in.nextLine()) ;
				intNumberValid = true;
			}catch(Exception e) {
				System.out.println(string1);
				intNumberValid = false;
			}
		}
		while (!intNumberValid);
		return intNum;
	}

	private static double getValidDouble(Scanner in, String ask2, String string2) {
		// TODO Auto-generated method stub
		double doublenum = 0 ;
		boolean doubleNumberValid = false;

		do {
			System.out.println(ask2);
			try {
				doublenum= Double.parseDouble(in.nextLine()) ;
				doubleNumberValid = true;
			}catch(Exception e) {
				System.out.println(string2);
				doubleNumberValid =false;
			}
		}
		while (!doubleNumberValid); 
		return doublenum;
	}

	private static String getValidYN(Scanner in, String ask3, String string3) {
		// TODO Auto-generated method stub
		String input = "";
		boolean validResponse = false;

		do {
			System.out.println(ask3);
			input = in.nextLine();
			if (input.equalsIgnoreCase("Y")) {
				validResponse = true ;
			}
			else if (input.equalsIgnoreCase("N")){ 
				validResponse = true;
			}
			else { System.out.println(string3);
			validResponse = false;}
		}
		while (!validResponse);
		
		return input;
	}// end of Main()
}