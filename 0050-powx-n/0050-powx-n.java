class Solution {
    public double myPow(double x, int n) {
        if (n < 0) {
            return positivePow(1 / x, -n);
        } else {
            return positivePow(x, n);
        }
    }

    public double positivePow(double x, int n) {
        if (n == 0) {
            return 1;
        }

        double half = positivePow(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
}