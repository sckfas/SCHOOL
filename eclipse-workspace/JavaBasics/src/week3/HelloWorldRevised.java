package week3;

import java.util.Scanner;

public class HelloWorldRevised {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		     // Using Scanner for getting Input from user
		     Scanner in = new Scanner(System.in);

		     //Ask the user's name
		     System.out.println("Please enter your name: ");
		     String name = in.nextLine();
		     System.out.println("Hello " + name + "!");
		     System.out.println();

		     //Ask the user What Ward they attend?  Assuming they are a member of the Church.
		     System.out.println("What Ward do you attend?: ");
		     String ward = in.nextLine();
		     System.out.println("So, you attend the " + ward + ".  My Ward is the St. Catharines 1st Ward.");
		     System.out.println();
		     
		     //Ask the user's What is your calling in your ward?
		     System.out.println("What is your calling?: ");
		     String calling = in.nextLine();
		     System.out.println("Your calling is " + calling + ".  My calling is Second Councellor in the Bishopric.");
		     System.out.println();
		     
		     //Ask the user's Favorite Scripture
		     System.out.println("What is your favorite scripture?: ");
		     String scripture = in.nextLine();
		     System.out.println("Your favorite scripture " + scripture + ", is the same as mine!");
		     System.out.println();
		     
		     //Ask the user's Favorite Conference talk
		     System.out.println("What is your favorite Conference Talk from October 2022?: ");
		     String talk = in.nextLine();
		     System.out.println("So, you like the " + talk + ".  My favorite favorite talk was from President Nelson.");
		     System.out.println();
		     
		     //Ask the user's How many Conference sessions did you attend?
		     System.out.println("How many Conference sessions did you attend?: ");
		     int sessions = Integer.parseInt(in.nextLine());
		     System.out.println("So, you attended " + sessions + " sessions.  I was able to attend 3 sessions.");
		     System.out.println();
     
	} 		 //end of main()

}
