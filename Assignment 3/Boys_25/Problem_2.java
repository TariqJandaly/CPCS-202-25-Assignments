/*
    Description:
    You must make a program that reads a floating-point number and prints
    a message saying in which of the following intervals the number belongs:
    [0,25], (25,50], (50,75], (75,100].

    If the read number is less than zero or greater than 100, the program
    must print the message "Fora de intervalo".

    Input:
    - The input file contains a floating-point number.
      Example:
        25.01
        25.00
        100.00
        -25.02

    Output:
    - The output must be a message indicating the interval.
      Example:
        Intervalo (25,50]
        Intervalo [0,25]
        Intervalo (75,100]
        Fora de intervalo
*/

// Import the Scanner class from the java.util package to allow us to read input from the user/keyboard.
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Create a new Scanner object named 'in' attached to the system's standard input (System.in) to read data.
		Scanner in = new Scanner(System.in);
		// Read the next floating-point token from the input and store it in the double variable 'value'.
		double value = in.nextDouble();

		// Call the custom method 'checkInterval', passing the variable 'value' as an argument to perform the calculation.
		checkInterval(value);
	}

	// Define a public static method named 'checkInterval' that accepts one double parameter named value.
	public static void checkInterval(double value) {
		// Check if the value is within the interval [0,25] (greater than or equal to 0 AND less than or equal to 25).
		if (value >= 0 && value <= 25) {
			// If the condition is true, print the message "Intervalo [0,25]" to the console.
			System.out.println("Intervalo [0,25]");
			// Check if the value is within the interval (25,50] (greater than 25 AND less than or equal to 50).
		} else if (value > 25 && value <= 50) {
			// If the condition is true, print the message "Intervalo (25,50]" to the console.
			System.out.println("Intervalo (25,50]");
			// Check if the value is within the interval (50,75] (greater than 50 AND less than or equal to 75).
		} else if (value > 50 && value <= 75) {
			// If the condition is true, print the message "Intervalo (50,75]" to the console.
			System.out.println("Intervalo (50,75]");
			// Check if the value is within the interval (75,100] (greater than 75 AND less than or equal to 100).
		} else if (value > 75 && value <= 100) {
			// If the condition is true, print the message "Intervalo (75,100]" to the console.
			System.out.println("Intervalo (75,100]");
			// If none of the above conditions are met (meaning the value is less than 0 or greater than 100), execute the following block.
		} else {
			// Print the message "Fora de intervalo" to the console.
			System.out.println("Fora de intervalo");
		}
	}
}
