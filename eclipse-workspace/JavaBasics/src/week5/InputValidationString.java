package week5;

import java.util.*;

public class InputValidationString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String input = "";

		System.out.println("Do you like to code in Java?: ");
		input = in.nextLine();
		
		do { 
			if (input.equalsIgnoreCase("y") ){
				System.out.println("That's great! I do too!");
			}else if (input.equalsIgnoreCase("n")) {
				System.out.println("That's ok. There are many other wonderful things in life to learn.");
			}else 
				System.out.println("Invalid Response! Please answer 'Y' or 'N'\n");	
		}while(!(input.equalsIgnoreCase("Y") || input.equalsIgnoreCase("N")));    // END do-while loop
	}// END static public void

}//END Class
