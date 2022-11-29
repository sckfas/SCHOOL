package week5;

import java.util.*;

public class InputValidationInteger{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		String input = "";
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;

		Boolean valid = false;

		do {
			System.out.print("Please enter a number:\n");
			input = in.nextLine();

			try {
				num1 = Integer.parseInt(input);         // Convert string to Integer and assign to int variable chestSize

				valid = true;

			}catch(Exception e) {
				System.out.println("Invalid Response! Please enter a whole number.\n");

			} // End of Try / Catch

		} while(!valid); {
			System.out.println("num1 = " + num1);
			System.out.println("num2 = " + (num2 = num1+ 1000));
			System.out.println("num3 = " + (num3 = num1 * 2));
		} //End do / while
		in.close();
	}
	
}