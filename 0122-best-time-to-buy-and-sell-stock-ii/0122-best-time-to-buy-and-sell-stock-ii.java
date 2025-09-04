class Solution {
    public int maxProfit(int[] prices) {
        int i=0;
        int n = prices.length;
        int canBuy = 1;
        int[][] dp = new int[n][2];

        for (int[] idp : dp){
            Arrays.fill(idp, -1);
        }

        return rec(i, canBuy, prices, n, dp);
    }

    private int rec(int i, int canBuy, int[] prices, int n, int[][] dp) {
        if (i >= n) {
            return 0;
        }

        if (dp[i][canBuy] != -1){
            return dp[i][canBuy];
        }

        int profit = Integer.MIN_VALUE;

        if (canBuy==1) {
            int buy = -prices[i] + rec(i+1, 0, prices, n, dp);
            int skip = 0 + rec(i+1, 1, prices, n, dp);
            profit = Math.max(buy, skip);
        }

        else {
            int sell = prices[i] + rec(i, 1, prices, n, dp);
            int skip = 0 + rec(i + 1, 0, prices, n, dp);
            profit = Math.max(sell, skip);
        }

        return dp[i][canBuy] = profit;
    }

    // public int maxProfit(int[] prices) {
    //     int minPrice = prices[0];
    //     int maxProfit = 0;

    //     for (int i=1; i<prices.length; i++){
    //         int profit = prices[i] - minPrice;
    //         maxProfit = Math.max(maxProfit, maxProfit + profit);
    //         minPrice = prices[i];
    //     }

    //     return maxProfit;
    // }
}