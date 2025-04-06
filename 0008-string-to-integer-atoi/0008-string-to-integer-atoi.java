class Solution {
    public int myAtoi(String s) {
        int i = 0, n = s.length();
        long ans = 0;
        boolean isNegative = false;

        // Step 1: Skipping the leading whitespaces
        while (i<n && s.charAt(i) == ' ') i++;

        // Step 2: Checking for sign
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')){
            isNegative = (s.charAt(i) == '-');
            i++;
        }

        // Step 3: Reading Digits
        while (i < n && Character.isDigit(s.charAt(i))){
            ans = ans * 10 + (s.charAt(i) - '0');

            // Step 4: Rounding Off if out of bounds
            if (!isNegative && ans >= Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (isNegative && -ans <= Integer.MIN_VALUE)  return Integer.MIN_VALUE;

            i++;
        }

        return isNegative ? (int)(-ans) : (int)ans;
    }
}