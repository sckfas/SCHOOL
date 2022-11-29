package week6;

public class countTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Skips the values 4 and 7
		//
		for (int i = 7; i <= 45; i++) {
			  if (i <= 6 && i >= 46) {
			    continue;
			  }
			  System.out.println(i);
			}

		//Exits after 5 iterations
		//
//		int i = 0;
//		while (i < 10) {
//		  System.out.println(i);
//		  i++;
//		  if (i == 5) {
//		    break;
//		  }
//		}

		// Skips the value 8
		//
//		int i = 0;
//		while (i < 10) {
//		  if (i == 8) {
//		    i++;
//		    continue;
//		  }
//		  System.out.println(i);
//		  i++;
//		}

	}

}
