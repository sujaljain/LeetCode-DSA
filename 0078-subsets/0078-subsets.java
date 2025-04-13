class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        int n = nums.length;

        for (int num = 0; num < Math.pow(2, n); num++) {
            List<Integer> subSet = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                //check if the ith bit is set or not
                if ((num & (1 << i)) != 0) {
                    subSet.add(nums[i]);
                }
            }

            result.add(subSet);
        }

        return result;
    }
}