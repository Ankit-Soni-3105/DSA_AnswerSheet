class Solution {
    public int trap(int[] height) {
        int ans=0;
        int n=height.length;
        int []left=new int[n];
        int []right=new int[n];
        
        left[0]=height[0];
        for(int i=1; i<n; i++){
            left[i]=Math.max(left[i-1], height[i]);// Update the maximum height to the left of the current index
        }

        right[n-1]=height[n-1];
        for(int i=n-2; i>=0; i--){
            right[i]=Math.max(right[i+1], height[i]);// Update the maximum height to the right of the current index
        }
        
        for(int i=0; i<n; i++){
            ans= ans + ( Math.min(left[i], right[i])- height[i]);// Calculate the water trapped at each index
            // Water trapped is the minimum of the maximum heights to the left and right minus the height   
        }

        return ans;
    }
}