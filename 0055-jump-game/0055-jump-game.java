class Solution {
    public boolean canJump(int[] nums) {
        // Super Optimised Approach Of Greedy By Mr. Striver Kumar Desai

        int maxIdx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > maxIdx)
                return false;
            maxIdx = Math.max(maxIdx, i + nums[i]);
        }
        return true;
    }

    // DONE BY MYSELF: MR. SUJAL SA JAIN

    // public boolean canJump(int[] nums) {
    //     int n = nums.length;

    //     Boolean[] dp = new Boolean[n];

    //     return solve(0, n, nums, dp);
    // }

    // private boolean solve(int idx, int n, int[] nums, Boolean[] dp) {
    //     // Base Case
    //     if (idx == n - 1)
    //         return true;
    //     if (idx >= n)
    //         return false;

    //     if (dp[idx] != null)    return dp[idx];

    //     // Actual Processing
    //     for (int i = nums[idx]; i > 0; i--) {
    //         if (solve(idx + i, n, nums, dp))
    //             return dp[idx + i] = true;
    //     }

    //     return dp[idx] = false;
    // }
}