/*

    Description:
    This program reads an integer X repeatedly and prints a sequence of 
    numbers from 1 to X, separated by spaces. The input stops when X is 0. 
    For each valid X, the sequence is printed on a separate line without 
    trailing spaces.

    Input:
    - Several integers (one per line). The sequence ends when the input is 0.
      Example:
        5
        10
        3
        0

    Output:
    - For each integer X (except 0), print a line with numbers from 1 to X 
      separated by spaces, like:
        1 2 3 4 5
        1 2 3 4 5 6 7 8 9 10
        1 2 3

*/

import java.util.Scanner;

public class Problem_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while (true) {
            int X = input.nextInt();
            if (X == 0) {
                break; // Stop when input is zero
            }
            
            String output = "";
            
            for (int i = 1; i <= X; i++) {
                if (i == X) {
                    output += i; // No space after the last number
                } else {
                    output += (i + " ");
                }
            }
            System.out.println(output); // Move to the next line after each sequence
        }
    }
}
