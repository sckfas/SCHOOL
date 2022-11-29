package week8;

import java.util.Scanner;

public class Week8Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		Boolean done = false;
		// boolean valid;
		do {

			System.out.println("This application allows you to input scores of a student and returns some info");

			// Get the Student name
			System.out.println("Please enter the number the Student name: ");
			String studentName = in.nextLine();

			int numOfAsgn = 0;

			// Get the number of assignments
			Boolean valid = false;
			do {
				System.out.println("Please enter the number of assignments: ");
				try {
					numOfAsgn = Integer.parseInt(in.nextLine());
					valid =true;
				}catch (Exception e) {
					System.out.println("Invaid Response! Please enter a whole number.");
				}
			}while(!valid);

			// Get the scores of the assignments
			double[] scores = new double[numOfAsgn];

			for(int i = 0;i < numOfAsgn; i++)	{
				do {
					System.out.println("Please enter the score of the next assignment: ");
					try {
						scores[i] = Double.parseDouble(in.nextLine());
						valid = true;
					}catch(Exception e){
						System.out.println("Invaid Response! Please enter a whole number.");
					}
				}while(!valid);

			}

			// Display the best Score, create a method
			double bestScore = getBestScore(scores);
			System.out.println("The best score for the " + studentName + " is: " + bestScore);

			//Display the Average, create a method
			double averageScore = getAverage(scores);
			System.out.println("The average score for the " + studentName + " is: " + averageScore);

			// Display the GPA, create a method
			double gpa = getGPA(averageScore);
			System.out.println("The GPA for " + studentName + " is: " + gpa);

			valid = false;
			do {
				System.out.println("Would you like to play again? (Y/N)");
				String input = in.nextLine();

				if(input.equalsIgnoreCase("y")) {
					done = false;
					valid = true;

				} else if (input.equalsIgnoreCase("n")) {
					done = true;
					valid = true;
				} else {
					System.out.println("Invalid response! Please enter (Y/N)");
				}

			} while(!valid);
		} while(!done);

		in.close();	

	}


	private static double getGPA(double score) {
		// TODO Auto-generated method stub
		if (score >= 93) {
			return 4.0;
		} else if (score >= 90) {
			return 3.7;
		} else if (score >= 87) {
			return 3.3;
		} else if (score >= 83) {
			return 3.0;
		} else if (score >= 80) {
			return 2.7;
		} else if (score >= 77) {
			return 2.3;
		} else if (score >= 73) {
			return 2.0;
		} else if (score >= 70) {
			return 1.7;
		} else if (score >= 67) {
			return 1.3;
		} else if (score >= 65) {
			return 1.0;
		} else {
			return 0;
		}
	}

	private static double getAverage(double[] scores) {
		// TODO Auto-generated method stub
		double sum = 0;
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		return sum /scores.length;
	}

	private static double getBestScore(double[] scores) {
		// TODO Auto-generated method stub
		double bestScore = scores[0];
		for(int i = 0; i < scores.length; i++ ) {
			if (scores[i] > bestScore) {
				bestScore = scores[i];
			}
		}
		return bestScore;
	}

}


//  0, 1, 2, 3, 4
// [0, 0, 0, 0, 0]
//double[] scores = new double[5];
// [4, 0, 0, 0, 0]
//scores[0] = 4;
//scores[1] = 9;
//scores[2] = 2;
//scores[3] = 1;
//scores[4] = 7;
// [4, 9, 2, 1, 7]