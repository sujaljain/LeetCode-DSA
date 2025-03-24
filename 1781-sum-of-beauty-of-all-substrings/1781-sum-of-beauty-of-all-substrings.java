class Solution {
    public int beautySum(String s) {
        int beauty = 0;
        int n = s.length();

        // Iterating over all possible starting values
        for (int i = 0; i < n; i++) {
            int[] freq = new int[26];

            // Extending the substring from i to j
            for (int j = i; j < n; j++) {
                freq[s.charAt(j) - 'a']++;

                beauty += getBeauty(freq);
            }
        }

        return beauty;
    }

    public int getBeauty(int[] freq) {
        int maxFreq = 0, minFreq = Integer.MAX_VALUE;

        for (int f : freq) {
            if (f > 0) {
                maxFreq = Math.max(maxFreq, f);
                minFreq = Math.min(minFreq, f);
            }
        }

        return maxFreq - minFreq;
    }
}