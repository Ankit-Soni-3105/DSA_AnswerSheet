import java.util.Arrays;

public class LeftRotateby1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int first = arr[0];
        for(int i = 0; i < arr.length - 1; i++) {// 0 se length - 1 tak chalao
            arr[i] = arr[i + 1]; // array me iske aage wale ko dal do to pahla wala element bach jayega jikso ham
        }
        arr[arr.length - 1] = first; // jisko ham array ke last index me first yani arr[0] ko dal denge

        System.out.println("After Left Rotate by 1: " + Arrays.toString(arr));//then toString me convert karke print kar denge
    }
}
