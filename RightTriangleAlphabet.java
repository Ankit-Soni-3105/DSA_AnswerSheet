import java.util.Scanner;

public class RightTriangleAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n= sc.nextInt();

        for (int i = 1; i < n; i++) {
            char chh = 'A';
            for (int j = 1; j <=i; j++) {
                System.out.print(chh + " ");
                chh++; // here we increase by one its ascii value then it will print a b c .....
            }
            System.out.println();
        }
    }
}
