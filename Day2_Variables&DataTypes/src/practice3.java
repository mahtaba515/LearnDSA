import java.util.*;
public class practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter price of pencil : ");
        float pencil = sc.nextFloat();

        System.out.print("Enter price of pen : ");
        float pen = sc.nextFloat();

        System.out.print("Enter price of eraser : ");
        float eraser = sc.nextFloat();

        float total = pencil + pen + eraser;
        System.out.println("Total Bill is : "+total);

        //Add on - with 18% tax
        float newTotal = total + (0.18f * total);

        System.out.println("Bill with 18% tax : "+newTotal);
    }
}
