class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();    // For Storing array elements along with their Frequency

        List<Integer>[] bucket = new List[nums.length + 1];  // To store the element corresponding to the frequency

        for (int el : nums) {
            map.put(el, map.getOrDefault(el, 0) + 1);
        }

        // Iterating over all the keys of the map
        for (int key : map.keySet()) {
            int val = map.get(key);

            // Checking whether that list contains any value or not
            if (bucket[val] == null) {
                bucket[val] = new ArrayList<>();
            }

            bucket[val].add(key);
        }

        int[] ans = new int[k];
        int idx = 0;

        // Iterating in reverse over the bucket, to get the most frequency elements
        for (int i = bucket.length - 1; i >= 0; i--) {
            if (bucket[i] != null){
                for (int j = 0; j<bucket[i].size() && idx < k; j++){
                    ans[idx++] = bucket[i].get(j);
                }
            }
        }

        return ans;
    }
}