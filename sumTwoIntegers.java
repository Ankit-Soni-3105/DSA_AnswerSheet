import java.util.Scanner;

public class sumTwoIntegers{
    public static void main(String[] args) {
//        take input two variables a and b
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first Number-> ");
        int a = sc.nextInt();
        System.out.print("Enter your second Number-> ");
        int b= sc.nextInt();

        int c= a+ b;
        System.out.print("The sum of " + a +" and " +b + " is-> " + c);
    }
}
