package week6;

public class count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j = 0;
		while (j < 10) {
		  if (j == 4 || j == 6) {
		    j++;
		    continue;
		  }
		  System.out.print(j + " ");
		  j++;
		}
	}

}
