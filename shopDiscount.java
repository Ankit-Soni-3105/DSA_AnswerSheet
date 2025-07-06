import java.util.Scanner;

public class shopDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total bill amount: ");
        double amount = sc.nextDouble();

        double discount = 0;

        if (amount >= 5000) {
            discount = amount * 0.20; // 20% discount
        } else if (amount >= 2000) {
            discount = amount * 0.10; // 10% discount
        } else {
            discount = amount * 0.05; // 5% discount
        }

        double finalAmount = amount - discount;
        System.out.println("Discount given: Rs." + discount);
        System.out.println("Amount to pay: Rs." + finalAmount);
    }
}
