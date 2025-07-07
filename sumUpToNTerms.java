import java.util.Scanner;

public class sumUpToNTerms {
    // here one number which is 3 then you add it with zero like 0+1+2+3 = 6
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();

        int sum = 0; //this variable is store the answer
        for (int i = 0; i <= n; i++) {

            sum = sum + i;
            // or ypu can use this shorthand operater sum+=i;
        }
        System.out.println("your answer is " + sum);
    }
}
