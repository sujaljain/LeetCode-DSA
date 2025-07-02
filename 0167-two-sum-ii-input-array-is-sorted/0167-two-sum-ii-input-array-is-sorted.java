class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<numbers.length; i++){
            int complement = target - numbers[i];

            if (!map.containsKey(complement)){
                map.put(numbers[i], i);
            }
            else{
                // It contains
                return new int[]{map.get(complement)+1, i+1};
            }
        }

        return new int[]{0};
    }
}