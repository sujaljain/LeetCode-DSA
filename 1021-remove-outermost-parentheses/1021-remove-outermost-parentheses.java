class Solution {
    public String removeOuterParentheses(String s) {
        int counter = 0;

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(')
                counter++;
            else if (ch == ')')
                counter--;

            // ------------------------------------

            if ((counter == 1 && ch == '(') || (counter == 0 && ch == ')')) {
                // Do nothing just go on to the next one
                continue;
            }
            
            else {
                result.append(ch);
            }
        }

        return result.toString();
    }
}