/*
    Description:
    Read an integer value N. After, read these N values and print a message
    for each value saying if this value is odd, even, positive or negative.
    In case of zero (0), print "NULL".

    Input:
    - The first line of input is an integer N (N < 10000), indicating the
      total number of test cases.
    - Each case is an integer number X (-10^7 < X < 10^7).
      Example:
        4
        -5
        0
        3
        -4

    Output:
    - For each test case, print a corresponding message in uppercase.
      Example:
        ODD NEGATIVE
        NULL
        ODD POSITIVE
        EVEN NEGATIVE
*/

// Import the Scanner class from the java.util package to allow us to read input from the user/keyboard.
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Create a new Scanner object named 'in' attached to the system's standard input (System.in) to read data.
		Scanner in = new Scanner(System.in);
		// Read the next integer token from the input to determine the number of test cases and store it in 'N'.
		int N = in.nextInt();

		// Start a for loop that iterates 'N' times (from i = 0 to i < N) to process each test case.
		for (int i = 0; i < N; i++) {
			// Read the next integer token from the input for the current test case and store it in 'x'.
			int x = in.nextInt();

			// Call the custom method 'checkEvenOdd', passing the current value 'x' as an argument to perform the check.
			checkEvenOdd(x);
		}
	}

	// Define a public static method named 'checkEvenOdd' that accepts one integer parameter named 'n'.
	public static void checkEvenOdd(int n) {
		// Check if the number 'n' is equal to zero.
		if (n == 0) {
			// If 'n' is 0, print "NULL" to the console as specified in the problem description.
			System.out.println("NULL");
			// If 'n' is not zero, execute the following block to determine parity and sign.
		} else {
			// Declare a String variable 'parity' to store whether the number is "EVEN" or "ODD".
			String parity;
			// Check if the remainder of 'n' divided by 2 is 0.
			if (n % 2 == 0) {
				// If the remainder is 0, the number is even.
				parity = "EVEN";
			} else {
				// If the remainder is not 0 (it is 1 or -1), the number is odd.
				parity = "ODD";
			}

			// Declare a String variable 'sign' to store whether the number is "POSITIVE" or "NEGATIVE".
			String sign;
			// Check if the number 'n' is greater than 0.
			if (n > 0) {
				// If 'n' is greater than 0, it is positive.
				sign = "POSITIVE";
			} else {
				// If 'n' is not greater than 0 (and we know it isn't 0 due to the earlier check), it must be negative.
				sign = "NEGATIVE";
			}

			// Print the combined result of parity and sign separated by a space (e.g., "ODD POSITIVE").
			System.out.println(parity + " " + sign);
		}
	}
}
