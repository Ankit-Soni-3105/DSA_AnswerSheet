public class buildArrayPermutation_1920 {
//    leetcode 1920
class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            res[i] = nums[nums[i]];
        }
        return res;
    }
}
}
