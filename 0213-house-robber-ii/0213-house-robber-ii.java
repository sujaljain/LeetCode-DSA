class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        // return rob_recursion(n - 1, nums, false);

        ArrayList<Integer> temp1 = new ArrayList<>();
        ArrayList<Integer> temp2 = new ArrayList<>();

        // If the array contains only 1 element
        if (n == 1) return nums[0];


        for (int i=0; i<n; i++){
            if (i != 0) temp1.add(nums[i]);
            if (i != n-1) temp2.add(nums[i]);
        }

        return Math.max(space_optimised(temp1, temp1.size()), space_optimised(temp2, temp2.size()));
    }

    private int space_optimised(ArrayList<Integer> nums, int n) {
        int prev = nums.get(0);
        int prev2 = 0;

        for (int i = 1; i < n; i++) {
            int take = nums.get(i);
            if (i > 1)
                take += prev2;
            int notTake = 0 + prev;
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