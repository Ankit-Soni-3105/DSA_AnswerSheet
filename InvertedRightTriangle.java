import java.util.Scanner;

public class InvertedRightTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n= sc.nextInt();

        for (int i = n; i >= 1; i--) { //  print same as previous but we are print all rows inverted like ulta
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
