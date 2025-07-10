import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        //here we take one an array and we are take input all elements one by one
        int[] arr = new int[n];
        int sum = 0;
        System.out.print("Enter your " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // take inputs acording to size
            sum += arr[i]; // and store the answer in sum variable after adding the all elements
        }
        double avg = (double) sum / n; //typecast
        System.out.println("the sum of all Elements is: "+ sum);
        System.out.println("the average of all Elements is: "+ avg);
    }
}
