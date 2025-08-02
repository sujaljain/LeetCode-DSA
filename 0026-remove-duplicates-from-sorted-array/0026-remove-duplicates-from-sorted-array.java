class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        int idx = 1;

        for (int i=0; i<nums.length-1; i++){
            if (nums[i] != nums[i+1]){
                count++;
                nums[idx++] = nums[i+1];
            }
        }

        return count;
    }
}