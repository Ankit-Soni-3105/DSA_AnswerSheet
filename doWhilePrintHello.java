import java.util.Scanner;

public class doWhilePrintHello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        do {
            System.out.println("Hello!");
            System.out.print("Press 'y' to continue: ");
            ch = sc.next().charAt(0);
        } while (ch == 'y' || ch == 'Y');
    }// yaha par ham jab tak user y press karta hai tab tak ham hello print kara rahe hai aur agar y ke alava wrong input press hua then it will stop.
}
