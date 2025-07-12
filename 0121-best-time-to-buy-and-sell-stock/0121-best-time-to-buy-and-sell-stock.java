class Solution {
    public int maxProfit(int[] prices) {
        int mProfit = 0;

        for (int i=0; i<prices.length; i++){
            int profit = 0;
            for (int j=i+1; j<prices.length; j++){
                profit = prices[j] - prices[i];
                mProfit = Math.max(profit, mProfit);
            }
        }

        return mProfit;
    }
}