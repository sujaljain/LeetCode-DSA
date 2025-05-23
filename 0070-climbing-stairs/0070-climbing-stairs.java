class Solution {
    public int climbStairs(int n) {
        return fibTerm(n+2);
    }

    public int fibTerm(int n){
        int a = 0;
        int b = 1;

        int c;

        for(int i=2; i<n; i++){
            c = a+b;
            a = b;
            b = c;
        }

        return b;
    }
}