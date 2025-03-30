class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lSum = 0, rSum = 0, maxSum = 0;

        for (int i = 0; i<k; i++){
            lSum = lSum + cardPoints[i];
        }

        maxSum = lSum;

        int rIdx = cardPoints.length-1;

        for (int i = k-1; i>= 0; i--){
            lSum = lSum - cardPoints[i];
            rSum = rSum + cardPoints[rIdx];
            rIdx--;

            maxSum = Math.max(maxSum, lSum + rSum);
        }

        return maxSum;
    }
}