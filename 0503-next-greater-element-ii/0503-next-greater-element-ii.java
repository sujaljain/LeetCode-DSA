class Solution {
    // MONOTONIC STACK APPROACH

    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        // Initialising the result with -1, as a default value when no greater element is found

        Arrays.fill(result, -1);

        // Stack to store indices of num array
        Stack<Integer> stack = new Stack<>();

        // Iterating TWICE through the array so as to move circularly
        for (int i = 0; i < 2 * n; i++) {

            int index = i % n; // Circular index

            // Checking if there's exist the next greater element
            while (!stack.isEmpty() && nums[stack.peek()] < nums[index]) {
                int top = stack.pop();
                result[top] = nums[index]; // Assigning the next greater element
            }

            // Only push indices from the first pass (i < n) to avoid redundancy
            if (i < n){
                stack.push(index);
            }
        }

        return result;
    }
}