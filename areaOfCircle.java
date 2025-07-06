import java.util.Scanner;

public class areaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius of circle: ");
        double r= sc.nextDouble();

        double area = Math.PI * r * r; // also you can use the 3.14
        System.out.print("The Area of Circle is: " + area);
    }
}
