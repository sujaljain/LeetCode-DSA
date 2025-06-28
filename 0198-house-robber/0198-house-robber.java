class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        // return rob_recursion(n-1, nums);  // Gives TLE

        // Memoisation (TOP-DOWN)
        // int[] dp = new int[n];
        // Arrays.fill(dp, -1);
        // return rob_memoisation(n-1, nums, dp);

        // Tabulation - (BOTTOMS-UP!)
        return rob_tabulation(n, nums);

    }

    private int rob_tabulation(int n, int[] nums) {
        int[] dp = new int[n];
        dp[0] = nums[0];

        for (int i = 1; i < n; i++) {
            int take = nums[i];
            if (i > 1)
                take += dp[i - 2];
            int notTake = 0 + dp[i-1];

            dp[i] = Math.max(take, notTake);
        }

        return dp[n-1];
    }

    private int rob_memoisation(int idx, int[] nums, int[] dp) {
        // Base Case
        if (idx == 0)
            return nums[idx];
        if (idx < 0)
            return 0;

        if (dp[idx] != -1)
            return dp[idx];

        int rob1 = nums[idx] + rob_memoisation(idx - 2, nums, dp);
        int rob2 = 0 + rob_memoisation(idx - 1, nums, dp);

        return dp[idx] = Math.max(rob1, rob2);
    }

    private int rob_recursion(int idx, int[] nums) {
        // Base Case
        if (idx == 0)
            return nums[idx];
        if (idx < 0)
            return 0;

        int rob1 = nums[idx] + rob_recursion(idx - 2, nums);
        int rob2 = 0 + rob_recursion(idx - 1, nums);

        return Math.max(rob1, rob2);

    }
}