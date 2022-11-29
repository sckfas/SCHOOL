package week3;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     // Using Scanner for getting Input from user
	     Scanner in = new Scanner(System.in);
	     
	     //Ask the user for witdh of square
	     System.out.println("Please enter the width of the square: ");
	     int sqWidth = Integer.parseInt(in.nextLine());
	     
	     //Ask the user for amount to deposit each month
	     System.out.println("Please enter width of the rectangle: ");
	     int recWidth = Integer.parseInt(in.nextLine());
	     
	     //Ask the user for amount to deposit each month
	     System.out.println("Please enter height of the rectangle: ");
	     int recHeight = Integer.parseInt(in.nextLine());
	     
	     int sqArea = sqWidth * sqWidth;
	     int recArea = recWidth * recHeight;
	     
	     System.out.println("The area of a square with a width of " + sqWidth + " is " + sqArea + ".");
	     System.out.println("The area of a rectangle with a width of " + recWidth + " and a height of " + recHeight + " is " + recArea + ".");
	     
	}

}
