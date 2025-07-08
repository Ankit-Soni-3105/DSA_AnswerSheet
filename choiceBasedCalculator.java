import java.util.Scanner;

public class choiceBasedCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.print("Enter first number: ");
            double a = sc.nextDouble();
            System.out.print("Enter second number: ");
            double b = sc.nextDouble();

            System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Divide");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Sum: " + (a + b));
                    break;
                case 2:
                    System.out.println("Difference: " + (a - b));
                    break;
                case 3:
                    System.out.println("Product: " + (a * b));
                    break;
                case 4:
                    if (b != 0)
                        System.out.println("Quotient: " + (a / b));
                    else
                        System.out.println("Cannot divide by zero!");
                    break;
                default:
                    System.out.println("Invalid choice");
            }

            System.out.print("Do you want to continue? (y/n): ");
            choice = sc.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
    }
}
