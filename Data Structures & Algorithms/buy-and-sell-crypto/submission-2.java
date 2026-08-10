class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = left + 1;

        int current = 0;
        int max = 0;
        while(right < prices.length){
            if(prices[right] < prices[left]){
                left = right;
            }
            else {
                current = prices[right] - prices[left];
                max = Math.max(current, max);
            }
            right++;
        }

        return max;
    }
}
