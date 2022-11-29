package week5;

import java.util.*;

public class GuessingGame3 {

		public static void main (String[] args ) {
			int count = 0;
			int i = 100;
			do {
			  i += 10;
			  count++;
			} while (count < 2);
			System.out.println(i);
		}
}