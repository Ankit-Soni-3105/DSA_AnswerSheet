class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int leftkey = 1;
        for (int i = 0; i < n; i++) {
            result[i] = leftkey;
            leftkey *= nums[i];
        }

        int rightkey = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= rightkey;
            rightkey *= nums[i];
        }
        return result;
    }
}