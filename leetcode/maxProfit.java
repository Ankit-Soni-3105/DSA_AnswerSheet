class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxPrice = 0;

        for (int price : prices) {
            minPrice = Math.min(minPrice, price);// Update the minimum price seen so far
            // Calculate the maximum profit if we sell at the current price
            maxPrice = Math.max(maxPrice, price - minPrice);
        }
        return maxPrice;
    }
}