import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        int temp = num; // it is copy for the check palindrom
        int reverse = 0;
        while (num > 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }
        System.out.println("here is your reverse: " + reverse);

        if (temp == reverse) {
            System.out.println("it is the Palindrome Number.");
        } else System.out.println("it is not Palindrome number.");
    }
}
