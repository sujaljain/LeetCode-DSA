class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        getPerms(0, nums.length, nums, ans);

        return ans;
    }

    private void getPerms(int idx, int n, int[] nums, List<List<Integer>> ans){
        // Base Case
        if (idx == n){
            List<Integer> temp = new ArrayList<>();
            for (int num : nums)
                temp.add(num);
            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int i=idx; i<n; i++){
            swap(i, idx, nums);

            // Further Recursive Call
            getPerms(idx+1, n, nums, ans);

            // BackTrack
            swap(i, idx, nums);
        }
    }

    private void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}