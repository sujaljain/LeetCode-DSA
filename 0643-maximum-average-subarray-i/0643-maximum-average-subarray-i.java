class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int maxSum = 0;
        int sum = 0;

        // Finding the sum of FIRST k Elements
        for (int i = 0; i<k; i++){
            sum += nums[i];
        }

        maxSum = sum;

        // Remaining k Elements
        for (int j = k; j<nums.length; j++){
            sum += nums[j];
            sum -= nums[j-k];

            if (sum > maxSum){
                maxSum = sum;
            }
        }

        return (double)maxSum/k;
    }
}