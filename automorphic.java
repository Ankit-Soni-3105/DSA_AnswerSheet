import java.util.Scanner;

public class automorphic {
    public static void main(String[] args) {
        // what is Automorphic number = A number whose square ends with the number itself.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt(); //input lo

        int sq = num * num;// square nikalo

        int temp = num; // copy banao
        int count = 0; // count banao for track counting
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        int lastDigits = sq % (int)Math.pow(10, count); // iska matlab hai ki ham number ka square kane ke bad ham square ko 10 to power count ki help se reminder nikal rahe hai agar reminder wahi number aaya to ye automorphic hoga jo ham aage check karenge

        if (lastDigits == num)
            System.out.println(num + " is Automorphic");
        else
            System.out.println(num + " is not Automorphic");
    }
}
