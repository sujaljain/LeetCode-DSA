class Solution {
    public boolean canPartition(int[] nums) {
        int totSum = 0;
        int n = nums.length;
        for (int num : nums)
            totSum += num;

        if (totSum % 2 != 0)
            return false; // Odd Sum cannot be possible to have an ans

        int k = totSum / 2;

        // return recursion(n-1, k, nums);

        // Memoisation
        // Boolean[][] dp = new Boolean[n][k+1];
        // return memoisation(n-1, k, nums, dp);

        // Tabulation (BOTTOMS-UP!)
        return tabulation(n, k, nums);
    }

    private boolean tabulation(int n, int k, int[] nums) {
        boolean[][] dp = new boolean[n][k + 1];

        // Base Cases
        for (int i = 0; i < n; i++)
            dp[i][0] = true; // When target == 0

        if (nums[0] <= k)
            dp[0][nums[0]] = true; // Rest false

        for (int idx = 1; idx < n; idx++) {
            for (int target = 1; target <= k; target++) {
                boolean notTake = dp[idx - 1][target];
                boolean take = false;

                if (nums[idx] <= target)
                    take = dp[idx - 1][target - nums[idx]];

                dp[idx][target] = (take || notTake);
            }
        }

        return dp[n-1][k];
    }

    private boolean memoisation(int idx, int target, int[] nums, Boolean[][] dp) {
        // Base Case
        if (target == 0)
            return true;
        if (idx == 0)
            return (nums[0] == target);

        if (dp[idx][target] != null)
            return dp[idx][target];

        boolean notTake = memoisation(idx - 1, target, nums, dp);
        boolean take = false;

        if (nums[idx] <= target)
            take = memoisation(idx - 1, target - nums[idx], nums, dp);

        return dp[idx][target] = (take || notTake);
    }

    private boolean recursion(int idx, int target, int[] nums) {
        // Base Case
        if (target == 0)
            return true;
        if (idx == 0)
            return (nums[0] == target);

        boolean notTake = recursion(idx - 1, target, nums);
        boolean take = false;

        if (nums[idx] <= target)
            take = recursion(idx - 1, target - nums[idx], nums);

        return (take || notTake);
    }
}