import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 9, 12};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element to search in this: ");
        int target = sc.nextInt();

        int index = -1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                index = i;
                break;
            }
        }

        System.out.println("Index: " + index);
    }
}
