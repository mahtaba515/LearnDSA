import java.util.*;
public class PrintOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number For Check Even or Odd: ");
        int a = sc.nextInt();

        if (a % 2 == 0){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }
    }
}
