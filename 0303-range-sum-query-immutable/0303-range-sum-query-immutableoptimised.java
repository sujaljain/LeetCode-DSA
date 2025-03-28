class NumArray {
    ArrayList<Integer> arr = new ArrayList<>();

    public NumArray(int[] nums) {
        for (int i = 0; i<nums.length; i++){
            arr.add(nums[i]);
        }
    }
    
    public int sumRange(int left, int right) {
        int sum = 0;
        for (; left<= right; left++){
            sum = sum + arr.get(left);
        }

        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */