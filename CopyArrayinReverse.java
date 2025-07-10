import java.util.Scanner;

public class CopyArrayinReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] rev = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++) {
            rev[i] = arr[n - 1 - i];
        }

        System.out.print("Reversed Array: ");
        for(int num : rev) {
            System.out.print(num + " ");
        }
    }
}
