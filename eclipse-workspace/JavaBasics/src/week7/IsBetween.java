package week7;
import java.util.*;
public class IsBetween {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean playAgain = false;
		int lowNum = 0;
		int betweenNum = 0;
		int highNum = 0;

		do {
			System.out.println("This program will ask the user for three numbers and determine if the second number lies between the first and the third.");

			boolean validNum = false;

			do {
				System.out.println("Please enter the low number: ");
				try {
					lowNum = Integer.parseInt(in.nextLine());
					validNum = true;
				}catch (Exception e) {
					System.out.println("Invalid Response! Please enter a whole number.");
				}
			}while(!validNum);

			validNum = false;

			do {
				System.out.println("Please enter the number to be tested (the between number):");
				try {
					betweenNum = Integer.parseInt(in.nextLine());
					validNum = true;
				}catch (Exception e) {
					System.out.println("Invalid Response! Please enter a whole number.");
				}
			}while(!validNum);

			validNum = false;

			do {
				System.out.println("Please enter the high number: ");
				try {
					highNum = Integer.parseInt(in.nextLine());
					if (highNum <= lowNum) {
						System.out.println("The number is =< " + lowNum);
						validNum = false;
					}else
					validNum = true;
				}catch (Exception e) {
					System.out.println("Invalid Response! Please enter a whole number.");
				}
			}while(!validNum);

			if (isBetween(betweenNum, lowNum, highNum) == true) {
				System.out.println(betweenNum + " lies between the numbers " + lowNum + " and " + highNum + ".");
			} else {
				System.out.println(betweenNum + " DOES NOT lie between the numbers " + lowNum + " and " + highNum + ".");
			}


			boolean validResponse = false;
			do {
				System.out.println("Do you want to play again? (Y/N)");
				String input = in.nextLine();
				if (input.equalsIgnoreCase("y")) {
					validResponse = true;
					playAgain = false;
				} else if (input.equalsIgnoreCase("n")) {
					validResponse = true;
					playAgain = true;				
				} else {
					System.out.println("Invalid Response! Please enter 'Y' or 'N'");
					validResponse = false;
				}
			}while(!validResponse);
		}while (!playAgain);
		in.close();
	}

	public static boolean isBetween(int between, int low, int high) {
		boolean isBetween = false;

		if (between > low && between < high) {
			isBetween = true;
		} else {
			isBetween = false;
		}
		return isBetween;
	}
}
