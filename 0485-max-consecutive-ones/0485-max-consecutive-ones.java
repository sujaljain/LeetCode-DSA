class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxLength = 0;
        int length = 0;
        for (int i : nums){
            if(i == 1){
                length++;
                maxLength = Math.max(maxLength, length);
            }
            else{
                length = 0;
            }
        }

        return maxLength;
    }
}