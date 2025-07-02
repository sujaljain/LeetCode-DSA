class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toLowerCase().toCharArray()){
            if (ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9'){
                sb.append(ch);
            }
        }

        System.out.println(sb);

        return (sb.toString().equals(sb.reverse().toString()));
    }
}