/*
    Description:
    In the chessboard, the square of the board on line 1, column 1 (upper
    left corner) is always white. We want to know the color of the square
    of the board in the lower right corner of a board with dimensions:
    L rows and C columns.

    Input:
    - The first line contains an integer L (1 <= L <= 1000).
    - The second line contains an integer C (1 <= C <= 1000).
      Example:
        6
        9

    Output:
    - Print 1 if the lower right corner is white, and 0 if it is black.
      Example:
        0
*/

// Import the Scanner class from the java.util package to allow us to read input from the user/keyboard.
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Create a new Scanner object named 'in' attached to the system's standard input (System.in) to read data.
		Scanner in = new Scanner(System.in);
		// Read the next integer token from the input and store it in the integer variable 'L' (representing rows).
		int L = in.nextInt();
		// Read the subsequent integer token from the input and store it in the integer variable 'C' (representing columns).
		int C = in.nextInt();

		// Call the custom method 'chessboardSquares', passing the values of L and C as arguments to perform the calculation.
		chessboardSquares(L, C);
	}

	// Define a public static method named 'chessboardSquares' that accepts two integer parameters, L and C.
	public static void chessboardSquares(int L, int C) {
		// Check if L and C are within the valid range (between 1 and 1000 inclusive) as specified in the problem constraints.
		if (L >= 1 && L <= 1000 && C >= 1 && C <= 1000) {
			// Calculate the sum of the row (L) and column (C). If the sum is even (remainder is 0 when divided by 2), the square is White.
			// If the sum of row and column indices is even, the color is White (1)
			// Otherwise, it is Black (0)
			if ((L + C) % 2 == 0) {
				// If the condition is true (sum is even), print "1" to the console representing the White color.
				System.out.println("1");
				// If the condition above is false (meaning the sum is odd), execute the following block.
			} else {
				// Print "0" to the console representing the Black color.
				System.out.println("0");
			}
		}
	}
}
