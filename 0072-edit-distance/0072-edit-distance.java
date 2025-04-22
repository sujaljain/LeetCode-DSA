
class Solution {
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();

        int[][] dp = new int[n+1][m+1];

        return levenshtein_distance(n - 1, m - 1, word1, word2, dp);
    }

    public int levenshtein_distance(int i, int j, String s1, String s2, int[][] dp) {
        if (i < 0)
            return j + 1;
        if (j < 0)
            return i + 1;

        if (dp[i][j] != 0)
            return dp[i][j];

        if (s1.charAt(i) == s2.charAt(j)) {
            return dp[i][j] = levenshtein_distance(i-1, j-1, s1, s2, dp);   
        }

        // Either insert, delete, or replace
        int insert = levenshtein_distance(i - 1, j, s1, s2, dp);
        int delete = levenshtein_distance(i, j - 1, s1, s2, dp);
        int replace = levenshtein_distance(i - 1, j - 1, s1, s2, dp);

        // Finding the minimum one out of 3
        int min = Math.min(insert, delete);
        min = Math.min(min, replace);

        return dp[i][j] = min + 1; // +1 is the cost of operation
    }
}