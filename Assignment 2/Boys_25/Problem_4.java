/*

    Description:
    This program reads two integers, X and Y, and prints the numbers from 1 to Y. 
    Each line contains X numbers separated by spaces. After every X numbers, 
    the program moves to the next line. There should be no extra spaces at 
    the end of any line.

    Input:
    - Two integer values X and Y, where (1 < X < 20) and (X < Y < 100000).
      Example:
        3 99

    Output:
    - Numbers from 1 to Y, printed in lines of X numbers each, separated by spaces.
      Example:
        1 2 3
        4 5 6
        7 8 9
        ...
        97 98 99

*/

import java.util.Scanner;

public class Problem_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int X = input.nextInt();
        int Y = input.nextInt();
        
        for (int i = 1; i <= Y; i++) {
            System.out.print(i);
            
            // Check if we reached the end of the current line
            if (i % X == 0) {
                System.out.println();
            } else {
                System.out.print(" ");
            }
        }
    }
}