class Solution {
    public String frequencySort(String s) {
        // Step 1: Counting the frequency of each character
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        // Step 2: Adding those unique characters in the list
        List<Character> chars = new ArrayList<>(map.keySet());
        
        // Step 3: Sorting the list by decreasing frequency
        Collections.sort(chars, (a,b) -> map.get(b) - map.get(a));

        // Step 4: Building the result string
        StringBuilder sb = new StringBuilder();

        for (char c : chars){
            int freq = map.get(c);

            for (int i=0; i<freq; i++){
                sb.append(c);
            }
        }

        return sb.toString();
    }
}