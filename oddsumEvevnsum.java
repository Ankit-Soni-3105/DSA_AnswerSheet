import java.util.Scanner;

public class oddsumEvevnsum {
    public static void main(String[] args) {
        // here is number 3 then its odd then 3+2+1+0= 6 and if even like 4 then 4 + 3 + 2 + 1 + 0 = 10
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();

        int Evensum = 0;
        int Oddnsum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % 2 == 0) {
                Evensum += i;

            } else {
                Oddnsum += i;
            }
        }
        System.out.println("the Even sum is: " + Evensum);
        System.out.println("the Odd sum is: " + Oddnsum);


    }
}
