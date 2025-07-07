import java.util.Scanner;

public class printNaturalNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your number of times print you: ");
        int n = sc.nextInt();
        if (n< 0){
            System.out.print("Enter positive Number");
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }
}
