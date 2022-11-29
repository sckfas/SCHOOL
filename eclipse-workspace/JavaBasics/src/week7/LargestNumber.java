package week7;

import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean playAgain = false;
		do {
			System.out.println("The program will ask the user for three numbers and determine which of the three is the largest."); //Describes the Game

			int num1 = getValidNum(in, "first"); //Provides name for num1 question, passes to getValidNumber
			int num2 = getValidNum(in, "second"); //Provides name for num2 question, passes to getValidNumber
			int num3 = getValidNum(in, "third"); //Provides name for num3 question, passes to getValidNumber

			largestNumber(num1, num2, num3); //Passes the numbers to largestNumber to evaluate
			playAgain =	getvalidResponePlayAgain(in);
		} while (!playAgain);
	}

	public static int largestNumber(int a, int b, int c) { //Receives the numbers into appropriate variable num1 = a, num2 = b num3 = c

		int largestNum = 0;
		if (a > b && a > c) {
			largestNum = a;
		} else if (b > a && b > c) {
			largestNum = b;
		} else {
			largestNum = c;
		}
		System.out.println("The largest of the three numbers is: " + largestNum);
		return largestNum;

	}
	public static int getValidNum(Scanner in, String number) { //Number Validation
		boolean validInput = false;
		int validNum = 0;
		do {
			System.out.println("Enter the " + number +" number: ");
			try {
				validNum = Integer.parseInt(in.nextLine());
				validInput = true;
			}catch (Exception e) {
				System.out.println("Invalid Response! Please enter a whole number.");
				validInput = false;
			}

		}while(!validInput);
		return validNum;
	}

	public static boolean getvalidResponePlayAgain(Scanner in) { //Do you want to play a game, again - Getting a valid response to play again.
		boolean exitLoop = false;
		boolean playAgain = false;
		do {
			System.out.println("Would you like to play again? (Y/N)");
			String validAnswer = in.nextLine();
			if (validAnswer.equalsIgnoreCase("Y")) {
				exitLoop = true;
				playAgain = false;
			} else if (validAnswer.equalsIgnoreCase("N"))  {
				exitLoop = true;
				playAgain = true;
			} else {
				System.out.println("Invalid Response! Please answer 'Y' or 'N'");
				exitLoop = false;		
			}
		}while (!exitLoop);	
		return playAgain;
	}
}
