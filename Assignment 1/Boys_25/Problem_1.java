/*
    Description:
    This program calculates the total amount to pay for two products.
    Each product has a code, quantity, and unit price. The program reads
    these values from the user, computes the total cost, and displays
    it in the required format "VALOR A PAGAR: R$ XX.XX" with 2 decimal places.

    Input:
    - Two lines, each containing: code (int), quantity (int), price (double)
      Example:
        12 1 5.30
        16 2 5.10

    Output:
    - A single line showing the total amount to pay in the format:
      Example:
        VALOR A PAGAR: R$ 15.50
*/
// Import the Scanner class from the java.util package to allow us to read input from the user/keyboard.
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Create a new Scanner object named 'input' attached to the system's standard input (System.in) to read data.
		Scanner input = new Scanner(System.in);

		// Read the integer token for the first product's code (Note: this value is read but not used in the calculation).
		int code1 = input.nextInt();
		// Read the integer token representing the quantity of units for the first product.
		int quantity1 = input.nextInt();
		// Read the floating-point token representing the price per unit of the first product.
		double price1 = input.nextDouble();

		// Read the integer token for the second product's code (Note: this value is read but not used in the calculation).
		int code2 = input.nextInt();
		// Read the integer token representing the quantity of units for the second product.
		int quantity2 = input.nextInt();
		// Read the floating-point token representing the price per unit of the second product.
		double price2 = input.nextDouble();

		// Calculate the total cost by summing the product of quantity and price for both items.
		double total = (quantity1 * price1) + (quantity2 * price2);

		// Print the final result formatted as "VALOR A PAGAR: R$ " followed by the total value with 2 decimal places.
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
	}
}
