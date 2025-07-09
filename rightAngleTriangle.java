import java.util.Scanner;

public class rightAngleTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <=n; i++) {
            for (int j=1; j<=i; j++){
//                System.out.print("* "); // print the all *
                System.out.print(j+ " "); // Right Triangle – Number by print jth iterator
            }
            System.out.println();
        }
    }
}
