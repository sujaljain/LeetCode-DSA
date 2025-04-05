class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // Step 1: Build the next greater map for all elements in num2
        Map<Integer, Integer> nextGreaterMap = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        // Traverse num2 from right to left
        for (int i = nums2.length-1; i>= 0; i--){
            int current = nums2[i];

            // Pop elements from stack that are less than or equal to current
            while (!stack.isEmpty() && stack.peek() <= current){
                stack.pop();
            }

            // If stack is not empty, the top element IS THE next greater element
            if (!stack.isEmpty()){
                nextGreaterMap.put(current, stack.peek());
            } else {
                // If the stack is empty, there is no next greater element
                nextGreaterMap.put(current, -1);
            }

            // Push the current element on to the stack for future comparisons
            stack.push(current);
        }

        // Step 2: Making the ans to be returned from the ans map
        int[] result = new int[nums1.length];

        for (int i = 0; i<nums1.length; i++){
            result[i] = nextGreaterMap.get(nums1[i]);
        }

        return result;
    }
}