package week3;

import java.util.*;

public class Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     // Using Scanner for getting Input from user
	     Scanner in = new Scanner(System.in);

	     //Ask the user for amount to deposit each month
	     System.out.println("Please enter your monthly deposit: ");
	     int deposit = Integer.parseInt(in.nextLine());
	     // System.out.println("Your monthly deposit is " + deposit);


	     //Ask the user the for the annual interest rate
	     System.out.println("Please enter the annual interest rate: ");
	     double interest = Integer.parseInt(in.nextLine());
	     double month = interest/100/12;
	     System.out.println();
	     
	     // System.out.println("The monthly interest is  " + month*100 + "%");
	     
	     // Calculating saving and interest over six period
	     double balance = deposit * (1 + month);        // First month
	     balance = (deposit + balance) * (1 + month);	// Second month
	     balance = (deposit + balance) * (1 + month);	// Third month
	     balance = (deposit + balance) * (1 + month);	// Fourth month
	     balance = (deposit + balance) * (1 + month);	// Fifth month
	     balance = (deposit + balance) * (1 + month);	// Sixth month
	     System.out.println("The ending balance after 6 months is $ " + balance);
	     System.out.println();     
		
	}

}