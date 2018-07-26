/* Shontinique Uqdah
 * 07/03/2018
 */

import java.util.Scanner;

public class Lab1_p1 {

	public static void main(String[] args) {
		
		//Creates scanner to read user input
		Scanner scnr = new Scanner(System.in);
		
		//Variable declarations
		int userNum1;
		int userNum2;
		String userString1;
		String userString2;
		int holdDigit1;
		int holdDigit2;
		int tempSum = 0;
		int original1;
		int newSum;
		
		//Prompts user for first integer
		do {
		System.out.print("Please enter a positive whole number with a minimum of 2 digits: ");
		userNum1 = scnr.nextInt();
		userString1 = "" + userNum1;
		original1 = userNum1;
		}
		//Ensures user is re-prompted until an appropriate integer has been entered
		while (userNum1 < 10);
		
		//Prompts user for a second integer with same number of digits as the first entry
		do {
			System.out.print("Please enter another positive whole number with the same number of digits as the first value entered: ");
			userNum2 = scnr.nextInt();
			userString2 = "" + userNum2;
			}
		//Ensures user is re-prompted until an integer with appropriate number of digits is entered
		while (userString1.length() != userString2.length());
		
		//Loops through each integer one digit at a time, until all places have been accessed
		while (userNum1 >= 1) {
			
			////Use modulo and division to access the digit in each place in the two integers
			holdDigit1 = userNum1 % 10;
			holdDigit2 = userNum2 % 10;
			
			//Checks if userNum1 has undergone any division yet by comparing to its original value, ensures only first sum gets stored
			if (userNum1 == original1) {
				
				//Stores first sum in a variable to be used for comparison later
				tempSum = holdDigit1 + holdDigit2;
				
				//Divides by 10 to shift off digit that has already been accessed and provide access to next digit place
				userNum1 /= 10;
				userNum2 /= 10;
		}
			//Stores all but the first sum of digits sequentially to be compared to the first sum
			else {
				newSum = holdDigit1 + holdDigit2;
				
				//Checks that the new sum and the initial sum are equal, if so program resumes
				if (newSum == tempSum) {
					userNum1 /= 10;
					userNum2 /= 10;
				}
				
				//Prints false and breaks from the loop, terminating the prrogram, if any two sums are not equal
				else {
					System.out.println("False");
					break;
				}
				
			}
		}
		
		//Prints true and terminates the program if all sums are equal
		if (userNum1 < 1) {
			System.out.println("True");
		}
			
		//Closes the scanner to avoid any memor leaks
		scnr.close();
				
	}

}
