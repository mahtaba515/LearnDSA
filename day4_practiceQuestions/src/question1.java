import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        // Question 1 : Write a Java program to get a number from the user and print whether it is
        //positive or negative.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number Here : ");
        int number = sc.nextInt();
        if (number > 0){
            System.out.println(number+" is a positive number");
        } else if (number < 0) {
            System.out.println(number+" is a negative number");
        } else {
            System.out.println("This number is Zero");
        }
    }
}
