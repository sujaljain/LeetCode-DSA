import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String str : strs) {
            // Sort the string to create a unique key
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedKey = new String(charArray);

            // Simplified way to add to the map
            if (!anagramMap.containsKey(sortedKey)) {
                anagramMap.put(sortedKey, new ArrayList<>());
            }
            anagramMap.get(sortedKey).add(str);
        }

        // Return the grouped anagrams
        return new ArrayList<>(anagramMap.values());
    }
}