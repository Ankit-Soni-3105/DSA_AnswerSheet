import java.util.Scanner;

public class strongNuber {
    public static int factorial(int number) {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
//        ham pahle hi nikal liye the factorial then we make a one function outside of main method which find the factorial
        // finally hamne ek method bana liya hai then we find the strong number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();//input lo
        int original = num;//copy bana lo
        int sum = 0;//sum variable le lo

        while (num > 0) {
            int digits = num %10;
            sum += factorial(digits);
            num /=10;
        }

        // fir check karlo us copy variable agar aapke sum ke barabr aa gaya hai to aapka number strong number hai
        if (sum == original) System.out.println(original + " is strong number");
        else System.out.println(original + " is not strong number.");

    }
}
