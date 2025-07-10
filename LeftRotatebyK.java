import java.util.Arrays;

public class LeftRotatebyK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        k = k % arr.length;  // If k > n

        for (int i = 0; i < k; i++) {
            int first = arr[0];
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = first;
        }

        System.out.println("After Left Rotate by " + k + ": " + Arrays.toString(arr));
    }
}

