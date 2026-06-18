class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r  = 1;
        int currentMax = 0;
        int profit;

        while(r < prices.length){
            if(prices[l] < prices[r]){
                profit = prices[r] - prices[l];
                currentMax = Math.max(currentMax, profit);
            }
            else {
                l = r;
            }
            r++;
        }

        return currentMax;
    }
}
