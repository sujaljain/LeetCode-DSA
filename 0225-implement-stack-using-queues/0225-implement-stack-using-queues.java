import java.util.*;

class MyStack {
    private Queue<Integer> q1;
    private Queue<Integer> q2;
    private int top;

    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    // Push element x onto stack.
    public void push(int x) {
        q1.offer(x);
        top = x;  // Update top to the last inserted element
    }

    // Removes the element on the top of the stack and returns it.
    public int pop() {
        // Move elements from q1 to q2, except the last one
        while (q1.size() > 1) {
            top = q1.poll();  // Update top to the last element in q1
            q2.offer(top);
        }
        
        // Pop the last element from q1 (this is the top element)
        int popped = q1.poll();

        // Swap q1 and q2 to continue using q1 for the next operations
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return popped;
    }

    // Get the top element.
    public int top() {
        return top;
    }

    // Returns whether the stack is empty.
    public boolean empty() {
        return q1.isEmpty();
    }
}
