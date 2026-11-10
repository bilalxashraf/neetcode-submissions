class Solution {
    public int maxProfit(int[] prices) {
        int minBuy = prices[0];
        int maxP = 0;

        for(int sell : prices) {
            int profit = sell - minBuy;
            maxP = Math.max(maxP, profit);
            minBuy = Math.min(minBuy, sell);
        }
        return maxP;
    }   
}
