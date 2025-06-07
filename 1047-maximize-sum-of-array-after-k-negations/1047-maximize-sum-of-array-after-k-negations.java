class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        int sum = 0;
        // Step 1: Sorting
        Arrays.sort(nums);

        // Step 2: Make every element +ve
        int i = 0;
        while (i < nums.length) {
            if (nums[i] < 0 && k>0){
                nums[i] = nums[i] * -1;
                k--;
            }
            i++;
        }

        // Step 3: Checking k
        if (k%2==0){
            for (int num : nums){
                sum += num;
            }
        }
        else{
            Arrays.sort(nums);
            nums[0] = nums[0] * -1;
            for (int num : nums){
                sum += num;
            }
        }

        return sum;
    }
}