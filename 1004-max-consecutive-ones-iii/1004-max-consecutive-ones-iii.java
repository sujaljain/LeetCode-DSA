class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxLength = 0, l = 0, r = 0, zeroes = 0;

        while (r < nums.length){
            if (nums[r] == 0)   zeroes++;

            while (zeroes > k){
                if (nums[l] == 0)    zeroes--;
                l++;
            }

            if (zeroes <= k){
                int length = r - l + 1;
                maxLength = Math.max(length, maxLength);
            }

            r++;
        }

        return maxLength;
    }
}