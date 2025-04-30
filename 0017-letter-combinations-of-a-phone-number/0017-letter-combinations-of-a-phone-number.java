class Solution {
    public List<String> letterCombinations(String digits) {
        String mapping[] = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

        List<String> ans = new ArrayList<String>();

        if (digits.length() == 0)
            return ans;

        solve(0, digits, new StringBuilder(), ans, mapping);

        return ans;
    }

    public void solve(int index, String digits, StringBuilder temp, List<String> ans, String mapping[]) {
        // Base Case
        if (index >= digits.length()) {
            ans.add(temp.toString());
            return;
        }

        // Processing
        int digit = digits.charAt(index) - '0';
        String value = mapping[digit];

        for (int i = 0; i < value.length(); i++) {
            temp.append(value.charAt(i)); // Add char
            solve(index + 1, digits, temp, ans, mapping); // Recursive call
            temp.deleteCharAt(temp.length() - 1); // Backtrack
        }
    }
}