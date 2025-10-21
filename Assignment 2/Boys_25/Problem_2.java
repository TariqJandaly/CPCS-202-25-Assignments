/*

    Description:
    This program reads multiple floating-point numbers representing student scores.
    It validates each score to ensure it is within the range [0, 10]. 
    Only two valid scores are accepted — after that, the program calculates 
    and prints their average. If an invalid score is entered, it displays 
    the message "nota invalida" and continues reading until two valid scores 
    are provided.

    Input:
    - Multiple floating-point numbers (can be positive or negative).
      Example:
        -3.5
        3.5
        11.0
        10.0

    Output:
    - For each invalid score, print:
        nota invalida
      After two valid scores, print:
        media = X.XX
      Example:
        nota invalida
        nota invalida
        media = 6.75

*/

import java.util.Scanner;

public class Problem_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int validCount = 0;
        double sum = 0.0;

        while (validCount < 2) {
            double score = input.nextDouble();
            
            if (score >= 0.0 && score <= 10.0) {
                sum += score;
                validCount++;
            } else {
                System.out.println("nota invalida");
            }
        }
        
        double average = sum / 2.0;
        System.out.printf("media = %.2f%n", average);
    }
}
