import java.util.HashMap;

public class SubarraySumCount {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int target = 12;

        System.out.println("Count: " + countSubarraysWithSum(arr, target));
    }

    static int countSubarraysWithSum(int[] arr, int target) {
        int count = 0, sum = 0;
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
        prefixSumMap.put(0, 1); // For subarrays starting at index 0

        for (int num : arr) {
            sum += num;
            // Check if (sum - target) is in map
            if (prefixSumMap.containsKey(sum - target)) {
                count += prefixSumMap.get(sum - target);
            }
            // Update prefix sum map
            prefixSumMap.put(sum, prefixSumMap.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
