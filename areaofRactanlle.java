import java.util.Scanner;

public class areaofRactanlle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Length of Rectangle: ");
        int l = sc.nextInt();

        System.out.print("Enter your Width of Rectangle: ");
        int b = sc.nextInt();

        int area = l * b;
        System.out.print("The Area of Rectangle is: " + area);
    }
}
