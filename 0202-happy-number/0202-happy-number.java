class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();

        while (n != 1) {
            int ans = 0;

            while (n != 0) {
                int dig = n % 10;
                ans = ans + dig * dig;
                n = n / 10;
            }

            n = ans;

            if (seen.contains(n)) {
                return false; // Cycle detected
            }
            seen.add(n);
        }

        return true;
    }
}