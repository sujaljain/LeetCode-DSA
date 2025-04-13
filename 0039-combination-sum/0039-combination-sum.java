class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();

        solve(0, target, 0, candidates, new ArrayList<>(), result);

        return result;
    }

    public void solve(int index, int target, int sum, int[] candidates, List<Integer> temp,
            List<List<Integer>> result) {
        // If sum matches target
        if (sum == target) {
            result.add(new ArrayList<>(temp));
            return;
        }

        // If index goes out of bounds or sum exceeds target
        if (index >= candidates.length || sum > target)
            return;

        // Include the current element
        temp.add(candidates[index]);
        solve(index, target, sum + candidates[index], candidates, temp, result);
        temp.remove(temp.size() - 1); // backtrack

        // Exclude the current element and move to next
        solve(index + 1, target, sum, candidates, temp, result);
    }
}