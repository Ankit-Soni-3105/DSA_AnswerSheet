import java.util.Scanner;

public class saperateDigitwithCountDigits {
    public static void main(String[] args) {
        //ab aaya hai main logic jaha en number hoga jisko ham digit wise separate karenege
//        agar ham 9 ko ham 4 se divide karte hai to iska reminder 1 bachega like 9%4=1
//        then we find of reminder
//        and print the remider
//        then devide by 10 then we get the separate each digits of a number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();


        while (num > 0) {
            int digits = num % 10;
            System.out.println(digits);
            num /= 10;
        }

    }
}
