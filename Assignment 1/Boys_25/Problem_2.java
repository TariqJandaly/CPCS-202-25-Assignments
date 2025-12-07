/*
    Description:
    This program reads an integer representing a DDD code for phone dialing.
    It then prints the corresponding city based on a predefined table of DDDs.
    If the DDD is not in the table, it prints "DDD nao cadastrado".

    Input:
    - A single integer number representing the DDD code.
      Example:
        11

    Output:
    - A single line showing the city name corresponding to the DDD.
      Example:
        Sao Paulo
    - If the DDD is not in the table:
        DDD nao cadastrado
*/

// Import the Scanner class from the java.util package to allow us to read input from the user/keyboard.
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Create a new Scanner object named 'input' attached to the system's standard input (System.in) to read data.
		Scanner input = new Scanner(System.in);
		// Read the next integer token from the input representing the DDD code and store it in 'ddd'.
		int ddd = input.nextInt();

		// Check if the DDD code corresponds to Brasilia (61).
		if (ddd == 61) {
			// If true, print "Brasilia" to the console.
			System.out.println("Brasilia");
			// Check if the DDD code corresponds to Salvador (71).
		} else if (ddd == 71) {
			// If true, print "Salvador" to the console.
			System.out.println("Salvador");
			// Check if the DDD code corresponds to Sao Paulo (11).
		} else if (ddd == 11) {
			// If true, print "Sao Paulo" to the console.
			System.out.println("Sao Paulo");
			// Check if the DDD code corresponds to Rio de Janeiro (21).
		} else if (ddd == 21) {
			// If true, print "Rio de Janeiro" to the console.
			System.out.println("Rio de Janeiro");
			// Check if the DDD code corresponds to Juiz de Fora (32).
		} else if (ddd == 32) {
			// If true, print "Juiz de Fora" to the console.
			System.out.println("Juiz de Fora");
			// Check if the DDD code corresponds to Campinas (19).
		} else if (ddd == 19) {
			// If true, print "Campinas" to the console.
			System.out.println("Campinas");
			// Check if the DDD code corresponds to Vitoria (27).
		} else if (ddd == 27) {
			// If true, print "Vitoria" to the console.
			System.out.println("Vitoria");
			// Check if the DDD code corresponds to Belo Horizonte (31).
		} else if (ddd == 31) {
			// If true, print "Belo Horizonte" to the console.
			System.out.println("Belo Horizonte");
			// If the DDD code does not match any of the above predefined codes, execute the following block.
		} else {
			// Print the message indicating the DDD is not registered/found.
			System.out.println("DDD nao cadastrado");
		}
	}
}
