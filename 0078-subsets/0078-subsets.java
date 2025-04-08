class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        solve(0, nums, temp, result);

        return result;
    }

    public void solve(int index, int[] nums, List<Integer> temp, List<List<Integer>> result) {
        if (index >= nums.length) {
            result.add(new ArrayList<>(temp));
            return;
        }

        // Exclusive Recursive Call
        solve(index + 1, nums, temp, result);

        // Inclusive Recursive Call
        int element = nums[index];
        temp.add(element);
        solve(index + 1, nums, temp, result);

        // Backtrack
        temp.remove(temp.size() - 1);
    }
}