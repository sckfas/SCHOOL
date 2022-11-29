package week5;

import java.util.*;

public class GuessingGame5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner in = new Scanner (System.in);	// get a java object to get users input
				
				//Global variables declaration and initialization
				int num = 0;
		        
		        int upperLimit = 100;
		        int lowerLimit = 1;
		        int randNum = 0;
				boolean valid = false;
		        int response = 0; //where I store the user's converted input
		        boolean validPlayingResponse = false;
		        boolean playAgain = true;
		        String userInput = " ";
		        boolean guessedNum = false;
		 
				
				
				do { // primary loop
				
				   //Game description
				   System.out.println("This program is a guessing game.");
				   System.out.println("The computer will generate a random integer between 1 and 100. The user will try to guess the number.");
				   System.out.println("Let's get started! ");
						
			       // computer generates a random number between min and max
				   randNum = (int)(Math.random()*upperLimit - lowerLimit + 1);
				   System.out.println("This is the random number to guess: " + randNum);
				   System.out.println("I'm thinking on a number between 1 and 100.  " );
				   // initialize guessCount and userGuess
				   int guessCount = 0;	
				   String userGuess = " "; 
				   do { // game loop
					   
					  do { // Numeric Input Validation loop 
						   // get guess from user
						 
						  System.out.println("What is your guess? ");
			             
			             userGuess = in.nextLine();
			             
			             try {
			            	 response = Integer.parseInt(userGuess);
			            	 valid = true;
			             }catch (Exception e ) {
			            	 System.out.println("Invalid Response! Please enter a whole number. \n");   	            	 
			             }// end of try/catch
			            
					  } // end of NIV loop 
					  while(!valid);
					  
					  guessCount++;
			          if (response == randNum ) {
					     System.out.println("CORRECT! You guessed it in " + guessCount + " tries");	
					     guessedNum = true;
				      }else if (response < randNum ) {
				    	  System.out.println("Your guess is too low ");
				    	  guessedNum = false;
				      }	  
				      else {
				    	  System.out.println("Your guess is too high ");
			              guessedNum = false;
				      }    
				   } // end of do of game loop
				   while (!guessedNum);
				   
			       do { // Non- Numeric Input Validation loop 
			    	   System.out.println("Would you like to play again? ");
			    	  userInput = in.nextLine();
			    	  if (userInput.equalsIgnoreCase("y") ){
			    		 playAgain= true; 
			    	  }else if (userInput.equalsIgnoreCase("n")) {
			    		  playAgain = false;
			    	  }else 
			    		  System.out.println("Invalid Response! Please answer 'Y' or 'N'\n");	
			       }  // end of Non-NVI loop
			       while(!(userInput.equalsIgnoreCase("Y") || userInput.equalsIgnoreCase("N")));
			       
				}// do of primary loop ends 
		        while (playAgain);
			} // end of main	
		} // end of class	