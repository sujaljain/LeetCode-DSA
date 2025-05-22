class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int[][] dp = new int[s.length()][s.length()];

        for (int i[] : dp) {
            Arrays.fill(i, -1);
        }

        return solve(0, 0, s, new HashSet<>(wordDict), dp);
    }

    private boolean solve(int start, int end, String s, Set<String> dict, int[][] dp) {
        if (dp[start][end] != -1)
            return dp[start][end] == 1 ? true : false;

        // Base Case
        if (end == s.length() - 1) {
            return dict.contains(s.substring(start, end + 1));
        }

        if (dict.contains(s.substring(start, end + 1))) {
            if (solve(end + 1, end + 1, s, dict, dp)) {
                dp[start][end] = 1;
                return true;
            }
        }
 
        dp[start][end] = solve(start, end + 1, s, dict, dp) ? 1 : 0;
        return dp[start][end] == 1 ? true : false;
    }
}