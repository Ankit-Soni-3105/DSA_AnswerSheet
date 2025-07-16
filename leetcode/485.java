class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans=0, sum=0;
        for(int i: nums){
            if(i==1) ans=Math.max(ans, ++sum);
            else sum=0;
        }
        return ans;
    }
}