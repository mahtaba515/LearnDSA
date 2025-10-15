/*Question 1 : In a program, input 3 numbers : A, B and C. You have to output the average of
        these 3 numbers.
        (Hint : Average of N numbers is sum of those numbers divided by N) */

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of A:");
        int a = sc.nextInt();

        System.out.print("Enter number of B:");
        int b = sc.nextInt();

        System.out.print("Enter number of C:");
        int c = sc.nextInt();

        float average = (a + b + c) / 3f;
        System.out.println("Average of 3 Numbers:"+ average);
    }
}
