class Solution {
    public int beautySum(String s) {
        int beauty = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                beauty += countBeauty(s.substring(i, j + 1));
            }
        }

        return beauty;
    }

    private int countBeauty(String s) {
        int[] freq = new int[26];

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        int maxFreq = 0, minFreq = Integer.MAX_VALUE;

        for (int f : freq) {
            if (f > 0) { // Ignoring zeroes
                maxFreq = Math.max(maxFreq, f);
                minFreq = Math.min(minFreq, f);
            }
        }

        return maxFreq - minFreq;
    }
}