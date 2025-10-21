/*

    Description:
    This program reads two integer values, X and Y, and calculates the sum of 
    all odd numbers that lie strictly between them (excluding X and Y). 
    The result is printed as an integer.

    Input:
    - Two integer values (can be in any order).
      Example:
        6
        -5

    Output:
    - A single integer: the sum of all odd numbers strictly between X and Y.
      Example:
        5

*/

import java.util.Scanner;

public class Problem_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int X = input.nextInt();
        int Y = input.nextInt();
        
        // Ensure X is smaller than Y by swapping if needed
        if (X > Y) {
            int temp = X;
            X = Y;
            Y = temp;
        }
        
        int sum = 0;
        
        for (int i = X + 1; i < Y; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        
        System.out.println(sum);
    }
}
