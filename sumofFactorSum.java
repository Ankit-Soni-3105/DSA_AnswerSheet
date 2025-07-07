import java.util.Scanner;

public class sumofFactorSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int factorSum =0;
        System.out.print("Factors: ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
                factorSum +=i;
            }
        }
        System.out.print("=> Sum of its: " + factorSum);
    }
}
