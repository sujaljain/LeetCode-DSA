class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false; // Anagrams must have the same length
        }

        // Frequency array for 26 lowercase English letters
        int[] freq = new int[26];

        // Count characters in 's' and 't'
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++; // Increment count for character in 's'
            freq[t.charAt(i) - 'a']--; // Decrement count for character in 't'
        }

        // Check if all frequencies are zero
        for (int i = 0; i<freq.length; i++) {
            if (freq[i] != 0) {
                return false; // Mismatch in frequency
            }
        }

        return true;
    }
}