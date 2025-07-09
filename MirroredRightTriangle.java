import java.util.Scanner;

public class MirroredRightTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n= sc.nextInt();

        for (int i = 1; i <=n ; i++) { // row ke liye same loop iterate
            for (int j = i; j <= n; j++) { // print first n times spaces but start with ith indexes
                System.out.print("  "); // print two spaces each time but it will print triangle
            }
            for (int k = 1; k <= i; k++) {// then print *
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
