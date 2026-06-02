class MinStack {
    private final Stack<Integer> mainStack;
    private final Stack<Integer> supportStack;

    public MinStack() {
        mainStack = new Stack<>();
        supportStack = new Stack<>();
    }
    
    public void push(int val) {
        if(mainStack.isEmpty()){
            supportStack.push(val);
        }
        mainStack.push(val);

        if(val <= supportStack.peek())
            supportStack.push(val);
    }
    
    public void pop() {
        if(mainStack.peek().equals(supportStack.peek()))
            supportStack.pop();
        mainStack.pop();
    }
    
    public int top() {
        return mainStack.peek();
    }
    
    public int getMin() {
        return supportStack.peek();
    }
}
