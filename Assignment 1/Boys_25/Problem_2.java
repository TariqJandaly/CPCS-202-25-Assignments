/*  

    Course : CPCS 202  
    Name : 
    University ID : 
    Section : 
    Name of lab instructor : 
    Problem number : 1050  
    Assignment number : #1  
    Beecrowd id : 

*/

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

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner input = new Scanner(System.in);

        int ddd = input.nextInt(); // Read the DDD code

        // Check the DDD using if-else statements
        if (ddd == 61) {
            System.out.println("Brasilia");
        } else if (ddd == 71) {
            System.out.println("Salvador");
        } else if (ddd == 11) {
            System.out.println("Sao Paulo");
        } else if (ddd == 21) {
            System.out.println("Rio de Janeiro");
        } else if (ddd == 32) {
            System.out.println("Juiz de Fora");
        } else if (ddd == 19) {
            System.out.println("Campinas");
        } else if (ddd == 27) {
            System.out.println("Vitoria");
        } else if (ddd == 31) {
            System.out.println("Belo Horizonte");
        } else {
            System.out.println("DDD nao cadastrado"); // If DDD not found
        }
    }
}
