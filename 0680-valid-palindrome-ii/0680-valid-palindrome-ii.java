class Solution {
    public boolean validPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                // Check By Removing a character either from front or back
                return checkPallindrome(s, left, right - 1) || checkPallindrome(s, left + 1, right);
            }
            left++;
            right--;
        }

        return true;
    }

    public boolean checkPallindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}