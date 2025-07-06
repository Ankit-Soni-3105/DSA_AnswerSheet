import java.util.Scanner;

public class gender {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your gender (M/F): ");
        char gender = sc.next().charAt(0);

        if (gender == 'M' || gender == 'm') {
            System.out.print("Good Morning Sir!");
        } else if (gender == 'F' || gender == 'f') {
            System.out.print("Good Morning Maam!");
        } else {
            System.out.print("Invalid input!");
        }
    }
}
