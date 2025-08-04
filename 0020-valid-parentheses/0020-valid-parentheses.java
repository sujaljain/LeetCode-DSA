class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char ch : s.toCharArray()){
            if (ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }
            else{
                if (stack.isEmpty())    return false;
                char last = stack.peek();
                if ((ch == ')' && last == '(') || (ch == '}' && last == '{') || (ch == ']' && last == '[')){
                        // Maamla okay hai
                        stack.pop();
                    }
                else{
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}