class Solution {
    public int maxProfit(int[] prices) {
        int minimumPrice = prices[0];
        int maximumProfit = 0;

        for (int i=1; i<prices.length; i++){
            int profit = prices[i] - minimumPrice;
            maximumProfit = Math.max(profit, maximumProfit);
            minimumPrice = Math.min(prices[i], minimumPrice);
        }

        return maximumProfit;
    }
}