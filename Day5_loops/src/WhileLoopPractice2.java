import java.util.Scanner;

public class WhileLoopPractice2 {
    public static void main(String[] args) {
//        Print Numbers From 1 to n
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your range here : ");
        int range = sc.nextInt();
        int counter = 1;
        while(counter <= range){
            System.out.print(counter+" ");
            counter++;
        }

    }
}
