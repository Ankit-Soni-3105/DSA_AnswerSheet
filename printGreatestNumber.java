import java.util.Scanner;

public class printGreatestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number ");
        int firstNum = sc.nextInt();
        System.out.print("Enter the First Number ");
        int secNum = sc.nextInt();

        if (firstNum > secNum){
            System.out.print("the greatest number is: " + firstNum);
        }else if (secNum > firstNum)
            System.out.print("the greatest number is: " + secNum);
        else System.out.print("Both number is equal");

    }
}
