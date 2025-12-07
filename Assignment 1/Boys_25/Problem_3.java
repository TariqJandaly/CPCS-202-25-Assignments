/*
    Description:
    This program reads an integer value representing an amount of money
    and calculates the smallest possible number of banknotes in which
    the value can be decomposed. The available banknotes are:
    100, 50, 20, 10, 5, 2, and 1.
    The program prints the original value and the number of banknotes
    required for each denomination.

    Input:
    - A single integer N (0 < N < 1000000)
      Example:
        576

    Output:
    - The original value, followed by the number of banknotes for each
      denomination in descending order, in Portuguese format.
      Example:
        576
        5 nota(s) de R$ 100,00
        1 nota(s) de R$ 50,00
        1 nota(s) de R$ 20,00
        0 nota(s) de R$ 10,00
        1 nota(s) de R$ 5,00
        0 nota(s) de R$ 2,00
        1 nota(s) de R$ 1,00
*/

// Import the Scanner class from the java.util package to allow us to read input from the user/keyboard.
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Create a new Scanner object named 'input' attached to the system's standard input (System.in) to read data.
		Scanner input = new Scanner(System.in);

		// Read the integer token from the input representing the total monetary value and store it in 'N'.
		int N = input.nextInt();
		// Create a variable 'remaining' initialized with the value of 'N' to keep track of the amount left to decompose.
		int remaining = N;

		// Print the original read value 'N' to the console as required by the output format.
		System.out.println(N);

		// Calculate the number of 100 banknotes by performing integer division.
		int notas100 = remaining / 100;
		// Update 'remaining' to be the remainder of the division by 100 (what is left after removing all 100s).
		remaining %= 100;

		// Calculate the number of 50 banknotes by performing integer division on the current remaining amount.
		int notas50 = remaining / 50;
		// Update 'remaining' to be the remainder of the division by 50.
		remaining %= 50;

		// Calculate the number of 20 banknotes by performing integer division.
		int notas20 = remaining / 20;
		// Update 'remaining' to be the remainder of the division by 20.
		remaining %= 20;

		// Calculate the number of 10 banknotes by performing integer division.
		int notas10 = remaining / 10;
		// Update 'remaining' to be the remainder of the division by 10.
		remaining %= 10;

		// Calculate the number of 5 banknotes by performing integer division.
		int notas5 = remaining / 5;
		// Update 'remaining' to be the remainder of the division by 5.
		remaining %= 5;

		// Calculate the number of 2 banknotes by performing integer division.
		int notas2 = remaining / 2;
		// Update 'remaining' to be the remainder of the division by 2.
		remaining %= 2;

		// The value left in 'remaining' corresponds to the number of 1 banknotes (since 1 divides any integer with remainder 0).
		int notas1 = remaining;

		// Print the calculated number of 100 banknotes in the specified format.
		System.out.println(notas100 + " nota(s) de R$ 100,00");
		// Print the calculated number of 50 banknotes in the specified format.
		System.out.println(notas50 + " nota(s) de R$ 50,00");
		// Print the calculated number of 20 banknotes in the specified format.
		System.out.println(notas20 + " nota(s) de R$ 20,00");
		// Print the calculated number of 10 banknotes in the specified format.
		System.out.println(notas10 + " nota(s) de R$ 10,00");
		// Print the calculated number of 5 banknotes in the specified format.
		System.out.println(notas5 + " nota(s) de R$ 5,00");
		// Print the calculated number of 2 banknotes in the specified format.
		System.out.println(notas2 + " nota(s) de R$ 2,00");
		// Print the calculated number of 1 banknotes in the specified format.
		System.out.println(notas1 + " nota(s) de R$ 1,00");
	}
}
