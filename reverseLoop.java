import java.util.Scanner;

public class reverseLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you number of times you want to reverse from n to 0 ");
        int n = sc.nextInt();

        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }
}
