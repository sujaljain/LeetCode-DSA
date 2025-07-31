class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;

        int original = x;
        int reverse = 0;

        while (x != 0) {
            int digit = x % 10;

            // if (reverse > (Integer.MAX_VALUE - digit) / 10) return false;

            reverse = reverse * 10 + digit;
            x /= 10;
        }

        return original == reverse;
    }
}