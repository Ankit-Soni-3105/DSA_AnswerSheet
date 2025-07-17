class Solution {
    public int maxSubArray(int[] arr) {
        int size = arr.length;
        int max_arr = Integer.MIN_VALUE;// Initialize to the smallest possible integer
        int min_end = 0; // This will hold the sum of the current subarray
        for (int i = 0; i < size; i++) {
            min_end = min_end + arr[i];// Add the current element to the current subarray sum
            if (max_arr < min_end)// If the current subarray sum is greater than the maximum found so far
                max_arr = min_end;
            if (min_end < 0)// If the current subarray sum is negative, reset it to 0
                min_end = 0;
        }
        return max_arr;
    }
}