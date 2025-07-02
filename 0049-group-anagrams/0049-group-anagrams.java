class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String str : strs){
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedKey = new String(charArray);

            if (!anagramMap.containsKey(sortedKey)){
                anagramMap.put(sortedKey, new ArrayList<String>());
            }

            anagramMap.get(sortedKey).add(str);
        }

        return new ArrayList<>(anagramMap.values());
    }
}