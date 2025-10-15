import java.util.Scanner;

public class ElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age: ");
        int age = sc.nextInt();
        if (age >= 18){
            System.out.println("You're Adult");
        } else if (age >= 13 && age < 18) {
            System.out.println("You are boy");
        }else {
            System.out.println("You are child");
        }
    }
}
