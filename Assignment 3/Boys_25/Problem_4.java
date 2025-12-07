/*
    Description:
    Read an array X[10]. After, replace every null or negative number of X
    by 1. Print all numbers stored in the array X.

    Input:
    - The input contains 10 integer numbers. These numbers can be positive
      or negative.
      Example:
        0
        -5
        63
        0

    Output:
    - For each position of the array, print "X[i] = x", where i is the
      position of the array and x is the number stored in that position.
      Example:
        X[0] = 1
        X[1] = 1
        X[2] = 63
        X[3] = 1
*/

// Import the Scanner class from the java.util package to allow us to read input from the user/keyboard.
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Create a new Scanner object named 'in' attached to the system's standard input (System.in) to read data.
		Scanner in = new Scanner(System.in);
		// Declare and instantiate an integer array named 'X' with a size of 10 elements.
		int[] X = new int[10];

		// Start a for loop that runs 10 times (from index 0 to 9) to populate the array.
		for (int i = 0; i < 10; i++) {
			// Read the next integer from the input and store it in the array at the current index 'i'.
			X[i] = in.nextInt();
		}

		// Call the custom method 'replaceArray', passing the populated array 'X' as an argument.
		replaceArray(X);
	}

	// Define a public static method named 'replaceArray' that accepts an integer array as a parameter.
	public static void replaceArray(int[] arr) {
		// Iterate through each element of the array using a for loop from index 0 to the length of the array.
		for (int i = 0; i < arr.length; i++) {
			// Check if the current element at index 'i' is null (0) or negative (less than 0).
			if (arr[i] <= 0) {
				// If the condition is true, replace the stored value with 1.
				arr[i] = 1;
			}

			// Print the formatted output showing the index "X[i]" and the final value (which may have been updated).
			System.out.println("X[" + i + "] = " + arr[i]);
		}
	}
}
