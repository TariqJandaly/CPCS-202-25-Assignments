/*
    Description:
    This program reads an integer X repeatedly and prints a sequence of
    numbers from 1 to X, separated by spaces. The input stops when X is 0.
    For each valid X, the sequence is printed on a separate line without
    trailing spaces.

    Input:
    - Several integers (one per line). The sequence ends when the input is 0.
      Example:
        5
        10
        3
        0

    Output:
    - For each integer X (except 0), print a line with numbers from 1 to X
      separated by spaces, like:
        1 2 3 4 5
        1 2 3 4 5 6 7 8 9 10
        1 2 3
*/

// Import the Scanner class from the java.util package to allow us to read input from the user/keyboard.
import java.util.Scanner;

public class Problem_1 {

	public static void main(String[] args) {
		// Create a new Scanner object named 'input' attached to the system's standard input (System.in) to read data.
		Scanner input = new Scanner(System.in);

		// Start an infinite while loop to continuously read inputs until the break condition is met.
		while (true) {
			// Read the next integer token from the input and store it in the variable 'X'.
			int X = input.nextInt();
			// Check if the input value 'X' is 0, which serves as the stop condition for the program.
			if (X == 0) {
				// If X is 0, break out of the infinite loop to terminate the program.
				break;
			}

			// Initialize an empty String variable named 'output' to build the sequence of numbers.
			String output = "";

			// Iterate using a for loop from 1 up to the value of X (inclusive).
			for (int i = 1; i <= X; i++) {
				// Check if 'i' is the last number in the sequence (equal to X).
				if (i == X) {
					// If it is the last number, append 'i' to the string without a trailing space.
					output += i;
				} else {
					// If it is not the last number, append 'i' followed by a space to separate it from the next number.
					output += (i + " ");
				}
			}
			// Print the final constructed string containing the sequence for the current X to the console.
			System.out.println(output);
		}
	}
}
