class Solution {
    public int getSum(int a, int b) {
        while (b != 0){
            int carry = (a & b) << 1;   // Calculate Carry
            a = a^ b;                   // Sum 
            b = carry;
        }
        return a;
    }
}