package week8;

import java.util.*;

public class ArrayListSum_OLD1 {

	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);

		String yesornot= "y";
		while(yesornot.equals("y")) {
			yesornot ="";
			System.out.println("This program will ask the user to enter a series of numbers.\r\n"
					+ "The user may enter as many numbers as they wish, hitting the enter key with no data when they wish to stop.\r\n"
					+ "The program will then display the array of numbers and the sum total of those numbers.");

			ArrayList<Integer> numbers= new ArrayList<Integer>();
			boolean validnumber= false;
			do {
				System.out.println("Please enter a number (or just hit enter to finish):");
				String inputfinish = in.nextLine();
				if (inputfinish.equals("")) {
					validnumber= true;
					break;
				}
				try {
					numbers.add(Integer.parseInt(inputfinish));
					validnumber=false; 
				}
				catch (Exception e) {
					System.out.println("Invalid Response!. Please enter a whole number");
				}
			}while (!validnumber);

			System.out.println("There are "+numbers.size()+" items in the ArrayList.");
			System.out.println("The sum total of numbers in the ArrayList is "+sumValues(numbers));
			System.out.println("The following numbers were duplicated in the ArrayList: "+dup(numbers));
			yesornot = playagain(in,"Do you wish to play again?");

		} //end while
	}  //end main

	private static String dup(ArrayList<Integer> numbers) {
		// TODO Auto-generated method stub
		
		
		return null;
	}

	//end class

	private static String playagain(Scanner in,String ask3) {
		String yesornott="";
		boolean yesornotvalid = false;
		do {
			String yess = "y";	
			String noo= "n";
			System.out.println(ask3);
			yesornott=in.nextLine();
			if (yesornott.equalsIgnoreCase(yess)) {
				yesornotvalid=true ;
			}
			else if (yesornott.equalsIgnoreCase(noo)){
				yesornotvalid=true;
			}

			else { System.out.println("Invalid Response! Please answer with a 'Y' or 'N'");

			yesornotvalid=false;}
		}

		while (!yesornotvalid);
		return yesornott;}	

	public static int sumValues(ArrayList<Integer> numbers) {
		int sumOfNumbers= 0;
		for (int i=0; i< numbers.size();i++) {
			sumOfNumbers += numbers.get(i) ; }

		return sumOfNumbers;
	}
}