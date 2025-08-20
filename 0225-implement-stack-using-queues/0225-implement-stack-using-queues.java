import java.util.*;

class MyStack {
    private Queue<Integer> q1;
    private Queue<Integer> q2;
    private int top;

    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x) {
        q1.offer(x);
        top = x;  // Update top to the last inserted element
    }

    public int pop() {
        // Move elements from q1 to q2, except the last one
        while (q1.size() > 1) {
            top = q1.poll();
            q2.offer(top);
        }
        
        int popped = q1.poll();

        // Swap q1 and q2 to continue using q1 for the next operations
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return popped;
    }

    public int top() {
        return top;
    }

    public boolean empty() {
        return q1.isEmpty();
    }
}
