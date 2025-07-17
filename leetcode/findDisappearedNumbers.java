class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {// Mark the presence of each number
            int index = Math.abs(nums[i]) - 1;// Convert to zero-based index
            if (nums[index] > 0)
                nums[index] = -nums[index];// Mark as negative to indicate presence
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)// If the number is still positive, it means the index + 1 is missing
                result.add(i + 1);
        }

        return result;
    }
}