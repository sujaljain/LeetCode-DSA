class Solution {
    public int countVowelSubstrings(String word) {
        int count = 0;
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');

        for (int i = 0; i < word.length(); i++) {
            Set<Character> seen = new HashSet<>();

            for (int j = i; j < word.length(); j++) {
                char ch = word.charAt(j);

                if (!vowels.contains(ch))
                    break;

                seen.add(ch);

                if (seen.size() == 5)
                    count++;
            }
        }

        return count;
    }
}