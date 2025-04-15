class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums); // To detect duplicates during iterations

        solve(0, nums, new ArrayList<>(), result);

        return result;
    }

    public void solve(int index, int[] nums, List<Integer> temp, List<List<Integer>> result) {

        result.add(new ArrayList<>(temp));

        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1]) {
                continue; // Skip Duplicates
            }

            temp.add(nums[i]); // Include
            solve(i + 1, nums, temp, result); // Recursion
            temp.remove(temp.size() - 1); // Backtrack
        }
    }
}