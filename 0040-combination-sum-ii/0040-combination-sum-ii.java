class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(candidates); // Key step for handling duplicates

        backtrack(0, target, candidates, new ArrayList<>(), result);

        return result;
    }

    public void backtrack(int start, int target, int[] candidates, List<Integer> temp, List<List<Integer>> result) {
        // If the target is found
        if (target == 0) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i  = start; i<candidates.length; i++){
            // Skipping Duplicates
            if (i > start && candidates[i] == candidates[i-1]) continue;

            // If any number exceeds the remaining target, no need to continue as the array is SORTED!
            if (candidates[i] > target) break;

            temp.add(candidates[i]);
            backtrack(i+1, target-candidates[i], candidates, temp, result);   // Moving to the next index
            temp.remove(temp.size()-1); // THE BACKTRACK
        }
    }
}