class MyStack {
    int[] q1 = new int[100];
    int[] q2 = new int[100];
    int f1 = 0, r1 = 0;
    int f2 = 0, r2 = 0;
    public MyStack() {

    }
    
    public void push(int x) {
        q2[r2++] = x;
        while (f1 < r1) {
            q2[r2++] = q1[f1++];
        }
        int[] tmp = q1;//swapping queues
        q1 = q2;
        q2 = tmp;
        f1 = 0;
        r1 = r2;
        f2 = 0;
        r2 = 0;
    }
    
    public int pop() {
        return q1[f1++];
    }
    
    public int top() {
        return q1[f1];
    }
    
    public boolean empty() {
        return f1 == r1;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */