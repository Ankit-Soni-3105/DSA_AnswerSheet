import java.util.Scanner;

public class printV {
    // IT'S ONT OF THE MY FAVORITE PATTERN QUESTION 😍😍
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Row Number: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
           //print the one spaces
            for (int j = 0; j < i; j++) { // 0 to i
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 0; j < 2* (n-i-1)-1; j++) {
                System.out.print(" ");
            }
            if (i!=n -1){// thodi si maths hai yarr copy pen uthao lag jao
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
