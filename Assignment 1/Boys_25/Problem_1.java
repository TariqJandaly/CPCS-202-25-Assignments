/*  

    Course : CPCS 202  
    Name :
    University ID :
    Section :
    Name of lab instructor :
    Problem number : 1010  
    Assignment number : #1  
    Beecrowd id :

*/

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
        VALOR A PAGAR: R$ 15.50

*/

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner input = new Scanner(System.in);
        
        // Set locale to US to ensure the program correctly reads decimal numbers with a dot
        input.useLocale(Locale.US); 

        // Read input for the first product
        int code1 = input.nextInt();      // Product code (not used in calculation)
        int quantity1 = input.nextInt();  // Number of units for product 1
        double price1 = input.nextDouble(); // Price per unit for product 1

        // Read input for the second product
        int code2 = input.nextInt();      // Product code (not used in calculation)
        int quantity2 = input.nextInt();  // Number of units for product 2
        double price2 = input.nextDouble(); // Price per unit for product 2

        // Calculate the total amount to pay
        double total = (quantity1 * price1) + (quantity2 * price2);

        // Print the total in the required format with 2 decimal places
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
    }
}