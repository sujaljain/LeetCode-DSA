class Solution {
    public int missingNumber(int[] nums) {
        // Using the formula for sum of n integers
        // that is n(n+1)/2

        int n = nums.length;
        int realSum = n*(n+1)/2;

        int sum = 0;
        for (int i = 0; i<n; i++){
            sum = sum + nums[i];
        }

        return realSum - sum;
    }
}