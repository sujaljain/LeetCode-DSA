class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return nums[0]; // Edge case

        // Rob from index 0 to n-2 (exclude last)
        int[] case1 = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            case1[i] = nums[i];
        }

        // Rob from index 1 to n-1 (exclude first)
        int[] case2 = new int[n - 1];
        for (int i = 1; i < n; i++) {
            case2[i - 1] = nums[i];
        }

        return Math.max(space_optimised(case1), space_optimised(case2));
    }

    private int space_optimised(int[] nums) {
        int n = nums.length;
        if (n == 0)
            return 0;
        if (n == 1)
            return nums[0];

        int prev = nums[0];
        int prev2 = 0;

        for (int i = 1; i < n; i++) {
            int take = nums[i];
            if (i > 1)
                take += prev2;
            int notTake = prev;
            int curr = Math.max(take, notTake);

            prev2 = prev;
            prev = curr;
        }

        return prev;
    }
    // private int rob_recursion(int idx, int nums[], boolean last){
    //     // Base Case
    //     if (idx == 0 && last==false)   return  nums[idx];
    //     else if (idx == 0 && last==true)    return 0;
    //     if (idx < 0)    return 0;

    //     if (idx == nums.length-1)   last = true;
    //     int pick = nums[idx] + rob_recursion(idx-2, nums, last);

    //     if (idx == nums.length-1 && last == true)   last = false;  
    //     int notPick = 0 + rob_recursion(idx-1, nums, last);

    //     return Math.max(pick, notPick);
    // }
}