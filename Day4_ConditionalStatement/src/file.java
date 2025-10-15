public class file {
    public static void main(String[] args) {
        int age = 17;
        if (age >= 18) {
            System.out.println("You can vote!");
        } else if (age > 13 && age < 18) {
            System.out.println("You're Teenager");
        } else {
            System.out.println("you can't vote!");
        }
    }
}
