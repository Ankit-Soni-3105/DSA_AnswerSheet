public class MoveNegatives {
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, -4, -5, 6, -7, 8};

        // it is solve by Quick Sort then we apply two pointer approach
        //take two variables
        int left = 0, right = arr.length - 1; // left is 1st position and right on the last

        while (left <= right) {
            if (arr[left] < 0) {
                left++;
            } else if (arr[right] >= 0) {
                right--;
            } else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
