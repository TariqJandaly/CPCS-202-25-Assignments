/*
    Description:
    This program reads multiple floating-point numbers representing student scores.
    It validates each score to ensure it is within the range [0, 10].
    Only two valid scores are accepted — after that, the program calculates
    and prints their average. If an invalid score is entered, it displays
    the message "nota invalida" and continues reading until two valid scores
    are provided.

    Input:
    - Multiple floating-point numbers (can be positive or negative).
      Example:
        -3.5
        3.5
        11.0
        10.0

    Output:
    - For each invalid score, print:
        nota invalida
      After two valid scores, print:
        media = X.XX
      Example:
        nota invalida
        nota invalida
        media = 6.75
*/

// Import the Scanner class from the java.util package to allow us to read input from the user/keyboard.
import java.util.Scanner;

public class Problem_2 {

	public static void main(String[] args) {
		// Create a new Scanner object named 'input' attached to the system's standard input (System.in) to read data.
		Scanner input = new Scanner(System.in);

		// Initialize an integer variable 'validCount' to 0 to keep track of how many valid scores have been entered.
		int validCount = 0;
		// Initialize a double variable 'sum' to 0.0 to accumulate the sum of valid scores.
		double sum = 0.0;

		// Start a while loop that continues to execute as long as 'validCount' is less than 2 (meaning we need 2 valid scores).
		while (validCount < 2) {
			// Read the next floating-point token from the input representing a score and store it in 'score'.
			double score = input.nextDouble();

			// Check if the 'score' is within the valid range [0.0, 10.0] inclusive.
			if (score >= 0.0 && score <= 10.0) {
				// If valid, add the 'score' to the 'sum' variable.
				sum += score;
				// Increment the 'validCount' by 1 to indicate a valid score was processed.
				validCount++;
			} else {
				// If the score is not within the valid range, print the error message "nota invalida" to the console.
				System.out.println("nota invalida");
			}
		}

		// Calculate the average by dividing the total 'sum' by 2.0.
		double average = sum / 2.0;
		// Print the final average formatted to 2 decimal places using printf.
		System.out.printf("media = %.2f%n", average);
	}
}
