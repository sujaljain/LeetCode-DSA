class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Storing all the freq of every particular num
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Storing the k most freq elements in a k sized array
        int[] res = new int[k];

        for (int i = 0; i < k; i++) {
            int maxFreq = -1;
            int maxKey = -1;

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() > maxFreq) {
                    maxFreq = entry.getValue();
                    maxKey = entry.getKey();
                }
            }
            res[i] = maxKey;
            map.remove(maxKey);
        }

        return res;
    }
}