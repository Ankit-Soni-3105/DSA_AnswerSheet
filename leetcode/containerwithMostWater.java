class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int h = 0;
        int w = height.length - 1;
        while (h < w) {
            int minheight = Math.min(height[h], height[w]);// Find the minimum height between the two pointers
            // Calculate the area with the current width and minimum height
            max = Math.max(max, minheight * (w - h));
            if (height[h] < height[w])// Move the pointer with the smaller height to potentially find a taller height
                ++h;
            else
                --w;// Move the pointer with the larger height to potentially find a taller height
        }
        return max;
    }
}