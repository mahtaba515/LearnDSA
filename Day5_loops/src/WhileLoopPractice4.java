import java.util.Scanner;

public class WhileLoopPractice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int n = sc.nextInt();
//      Print sum of first n natural numbers
        int sum = 0;
        int i = 1;
        while(i <= n){
            sum = sum + i;
            i++;
        }
        System.out.println("Sum of First "+n+" Natural Number : "+sum);
    }
}
