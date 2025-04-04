class MyQueue {
    Stack<Integer> s1;
    Stack<Integer> s2;
    int bottom;

    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    
    public void push(int x) {
        s1.push(x);
        if (s1.size() == 1){
            bottom = x;
        }
    }
    
    public int pop() {
        while (s1.size() > 1){
            bottom = s1.pop();
            s2.push(bottom);
        }

        int popped = s1.pop();

        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }

        return popped;
    }
    
    public int peek() {
        return bottom;
    }
    
    public boolean empty() {
        return s1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */