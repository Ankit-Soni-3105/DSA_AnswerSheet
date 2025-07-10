public class CheckifArrayisSorted {
    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 9, 10, 15};
        boolean isSorted = true;

        for(int i = 1; i < arr.length; i++) {// simple brute force check agla element bada hai ya nahi
            if(arr[i] < arr[i - 1]) {
                isSorted = false;
                break;
            }
        }

        System.out.println(isSorted ? "YES" : "NO");
    }
}
