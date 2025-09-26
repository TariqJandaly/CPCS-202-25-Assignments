/*  

    Course : CPCS 202  
    Name : 
    University ID : 
    Section : 
    Name of lab instructor : 
    Problem number : 1018  
    Assignment number : #1  
    Beecrowd id : 

*/

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

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt(); // Read the amount
        int remaining = N;       // Variable to keep track of remaining amount

        // Print the original value
        System.out.println(N);

        // Calculate number of banknotes for each denomination
        int notas100 = remaining / 100;
        remaining %= 100;

        int notas50 = remaining / 50;
        remaining %= 50;

        int notas20 = remaining / 20;
        remaining %= 20;

        int notas10 = remaining / 10;
        remaining %= 10;

        int notas5 = remaining / 5;
        remaining %= 5;

        int notas2 = remaining / 2;
        remaining %= 2;

        int notas1 = remaining; // Remaining is all 1s

        // Print the number of banknotes for each denomination
        System.out.println(notas100 + " nota(s) de R$ 100,00");
        System.out.println(notas50 + " nota(s) de R$ 50,00");
        System.out.println(notas20 + " nota(s) de R$ 20,00");
        System.out.println(notas10 + " nota(s) de R$ 10,00");
        System.out.println(notas5 + " nota(s) de R$ 5,00");
        System.out.println(notas2 + " nota(s) de R$ 2,00");
        System.out.println(notas1 + " nota(s) de R$ 1,00");
    }
}