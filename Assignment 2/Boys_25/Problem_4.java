/*
    Description:
    This program reads two integers, X and Y, and prints the numbers from 1 to Y.
    Each line contains X numbers separated by spaces. After every X numbers,
    the program moves to the next line. There should be no extra spaces at
    the end of any line.

    Input:
    - Two integer values X and Y, where (1 < X < 20) and (X < Y < 100000).
      Example:
        3 99

    Output:
    - Numbers from 1 to Y, printed in lines of X numbers each, separated by spaces.
      Example:
        1 2 3
        4 5 6
        7 8 9
        ...
        97 98 99
*/

// Import the Scanner class from the java.util package to allow us to read input from the user/keyboard.
import java.util.Scanner;

public class Problem_4 {

	public static void main(String[] args) {
		// Create a new Scanner object named 'input' attached to the system's standard input (System.in) to read data.
		Scanner input = new Scanner(System.in);

		// Read the first integer token 'X' which determines how many numbers are printed per line.
		int X = input.nextInt();
		// Read the second integer token 'Y' which indicates the total count of numbers to be printed.
		int Y = input.nextInt();

		// Start a for loop that iterates from 1 to Y (inclusive) to print the sequence.
		for (int i = 1; i <= Y; i++) {
			// Print the current number 'i' to the console without a newline immediately following it.
			System.out.print(i);

			// Check if the current count 'i' is a multiple of 'X' (meaning we have printed X numbers on this line).
			if (i % X == 0) {
				// If true, print a newline character to move the cursor to the beginning of the next line.
				System.out.println();
			} else {
				// If false (not the end of the line), print a space to separate the current number from the next one.
				System.out.print(" ");
			}
		}
	}
}
