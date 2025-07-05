import java.util.Scanner;

public class calculatePercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Maths marks: ");
        int maths = sc.nextInt();

        System.out.print("Enter Computer marks: ");
        int computer = sc.nextInt();

        System.out.print("Enter English marks: ");
        int english = sc.nextInt();

        int total = maths + computer + english;
        double percentage = (total / 300.0) * 100;

        System.out.println("Total Marks: " + total);
        System.out.printf("Percentage: %.2f%%", percentage);
    }
}
