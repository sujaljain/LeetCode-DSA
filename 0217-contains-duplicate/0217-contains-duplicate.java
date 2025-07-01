class Solution {
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> seen = new HashSet<>();

        for (int num : nums){
            if (!seen.contains(num))   seen.add(num);
            else return true;
        }

        return false;

        // HashMap<Integer, Integer> map = new HashMap<>();

        // for (int i=0; i<nums.length; i++){
        //     map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        // }

        // // Now checking from the keyset
        // for(int key : map.keySet()){
        //     int value = map.get(key);

        //     if (value > 1)  return true;
        // }

        // return false;
    }
}