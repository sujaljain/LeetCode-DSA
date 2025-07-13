class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        // Prefix Array
        int[] prefix = new int[n];
        prefix[0] = 1;
        for (int i=1; i<n; i++){
            prefix[i] = prefix[i-1] * nums[i-1];
        }

        // Suffix Array
        int[] suffix = new int[n];
        suffix[n-1] = 1;
        for (int i=n-2; i>=0; i--){
            suffix[i] = suffix[i+1] * nums[i+1];
        }

        // Now, final product of prefix and suffix
        int ans[] = new int[n];
        for (int i=0; i<n; i++){
            ans[i] = prefix[i] * suffix[i];
        }

        return ans;
    }
}