class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();

        solve(0, 0, n, "", result);

        return result;
    }

    public void solve(int open, int close, int n, String temp, List<String> result) {
        // Base Case
        if (open + close == 2 * n) {
            result.add(temp);
            return;
        }

        // Open Bracket
        if (open < n) {
            solve(open + 1, close, n, temp + "(", result);
        }

        // Close Bracket
        if (close < open) {
            solve(open, close + 1, n, temp + ")", result);
        }
    }
}