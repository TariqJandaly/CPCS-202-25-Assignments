/*
    Description:
    This program reads two integer values, X and Y, and calculates the sum of
    all odd numbers that lie strictly between them (excluding X and Y).
    The result is printed as an integer.

    Input:
    - Two integer values (can be in any order).
      Example:
        6
        -5

    Output:
    - A single integer: the sum of all odd numbers strictly between X and Y.
      Example:
        5
*/

// Import the Scanner class from the java.util package to allow us to read input from the user/keyboard.
import java.util.Scanner;

public class Problem_1 {

	public static void main(String[] args) {
		// Create a new Scanner object named 'input' attached to the system's standard input (System.in) to read data.
		Scanner input = new Scanner(System.in);

		// Read the first integer token from the input and store it in variable 'X'.
		int X = input.nextInt();
		// Read the second integer token from the input and store it in variable 'Y'.
		int Y = input.nextInt();

		// Check if the first number 'X' is greater than the second number 'Y'.
		if (X > Y) {
			// If true, swap the values of X and Y so that X is the smaller number (start of range) and Y is the larger number (end of range).
			int temp = X;
			X = Y;
			Y = temp;
		}

		// Initialize an integer variable 'sum' to 0 to store the result of the addition.
		int sum = 0;

		// Start a for loop iterating from X + 1 (strictly greater than X) up to Y (strictly less than Y).
		for (int i = X + 1; i < Y; i++) {
			// Check if the current number 'i' is odd by verifying if the remainder of division by 2 is not 0.
			if (i % 2 != 0) {
				// If 'i' is odd, add its value to the 'sum' variable.
				sum += i;
			}
		}

		// Print the final calculated 'sum' to the console.
		System.out.println(sum);
	}
}
