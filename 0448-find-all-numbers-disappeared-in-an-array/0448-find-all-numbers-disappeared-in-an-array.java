class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();

        int n  = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i<n; i++){
            map.put(i+1, map.getOrDefault(i+1, 0) + 1);
        }

        for (int i = 0; i<n; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (int key : map.keySet()){
            int value = map.get(key);
            if (value == 1){
                result.add(key);
            }
        }

        return result;
    }
}