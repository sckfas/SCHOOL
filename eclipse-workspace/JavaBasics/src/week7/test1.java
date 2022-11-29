package week7;
import java.util.*;
public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int lowNum = 10;
		int highNum = 0;
		Boolean validNum = false;
		
		do {
			System.out.println("Please enter the high number: ");
			try {
				highNum = Integer.parseInt(in.nextLine());
				if (highNum <= lowNum) {
					System.out.println("The number is too low");
					// validNum = false;
				}else
				validNum = true;
			}catch (Exception e) {
				System.out.println("Invalid Response! Please enter a whole number.");
			}
		}while(!validNum);

		validNum = false;
	}

}
