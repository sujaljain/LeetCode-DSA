class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();

        solve(0, s, new ArrayList<>(), result);

        return result;
    }

    public void solve(int index, String s, List<String> temp, List<List<String>> result) {
        if (index == s.length()) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = index; i < s.length(); i++) {
            String substr = s.substring(index, i + 1);

            if (isPalindrome(substr)) {
                temp.add(substr);
                solve(i + 1, s, temp, result);
                temp.remove(temp.size() - 1); // Backtrack
            }
        }
    }

    private boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left++) != str.charAt(right--))
                return false;
        }

        return true;
    }
}