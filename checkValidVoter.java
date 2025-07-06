import java.util.Scanner;

public class checkValidVoter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.print("Hello " + name + ", you are a valid voter.");
        } else {
            System.out.print("Sorry " + name + ", you can't cast the vote.");
            int yearsLeft = 18 - age;
            System.out.print("You will be eligible after " + yearsLeft + " years.");
        }
    }
}
