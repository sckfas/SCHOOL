package week5;

import java.lang.Math;
import java.util.Scanner;
public class GuessingGame {

	public static void main(String []args){
		Scanner in = new Scanner (System.in);

		int max = 100;
		int min = 1;
		int range = max - min + 1;
		boolean error = false;
		boolean iftry = false;
		boolean playagain = false;
		boolean repeat = false;
		int guess = 0;
		
		do {
		System.out.println("This program is a guessing game.");
		System.out.println("The computer will generate a random integer between 1 and 100. The user will try to guess the number.");
		System.out.println("Let's get started!");
		System.out.println("I'm thinking of a number between 1 and 100.");
			
		int randnum = (int)(Math.random()*(range) + min);
		System.out.println("what is your guess? "+ randnum);
		
		
		
		
		
		do { // loop for if and else if
			do { //loop for try and catch
				try { 
					String input = in.nextLine();
					guess = Integer.parseInt(input);	
					error = true;
				}catch (Exception e) { 		
					System.out.println("Invalid Response! Please enter a whole number.");
				}
			}while (!error);//loop for try and catch



			if (randnum == guess) {
				System.out.println("CORRECT! You guessed it in");
				iftry = true;
			}else if (randnum < guess){
				System.out.println("Your guess is too high. Try again");
				iftry = false;
			}else if (randnum > guess){
				System.out.println("Your guess is too low. Try again");
				iftry = false;
			}		
		}while(!iftry);// loop for if and else if
		
		System.out.println("Would you like to play again?");
		
		do {// loop for play again
			
		String answer = in.nextLine();
		if (answer.equalsIgnoreCase("y")) {
			System.out.println ("");						
			 playagain = true;
		}  else if (answer.equalsIgnoreCase("n")) {
			System.out.println("");
			playagain=true;
		} else {
			System.out.println("Invalid Response! Please answer with a 'Y' or 'N'.");
			System.out.println("Would you like to play again? (Y/N)");
			playagain=false;
		}
		}while (!playagain);// loop for play again
			String answer ="";
		if (answer.equalsIgnoreCase("n")) 
			repeat = true;
		}while (!repeat);

	}
}
