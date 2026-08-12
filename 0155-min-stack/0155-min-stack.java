class MinStack {
    Stack<Integer> s= new Stack<>();
    Stack<Integer> mins= new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int value) {
        s.push(value);
        if (mins.isEmpty() || value <= mins.peek())
            mins.push(value);
    }
    
    public void pop() {
        if (s.peek().equals(mins.peek()))
            mins.pop();
        s.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return mins.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */