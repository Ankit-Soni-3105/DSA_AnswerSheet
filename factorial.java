import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        // here is number 3 then its factorial is 3 * 2 * 1 = 6
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();

        int fact = 1; //this variable is store the answer byu default 1 because 1fact is = 1
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("your answer is " + fact);
    }
}
