class Solution {
    public int totalFruit(int[] fruits) {
        int l = 0, r = 0, maxLen = 0;
        int k = 2; // No. Of Buckets Given In The Question

        HashMap<Integer, Integer> map = new HashMap<>();

        while (r < fruits.length){
            map.put(fruits[r], map.getOrDefault(fruits[r], 0)+1);

            while (map.size() > k){
                map.put(fruits[l], map.get(fruits[l])-1);

                if (map.get(fruits[l]) == 0){
                    map.remove(fruits[l]);
                }

                l++;
            }

            if (map.size() <= k){
                maxLen = Math.max(maxLen, r-l+1);
            }

            r++;
        }
        return maxLen;
    }
}