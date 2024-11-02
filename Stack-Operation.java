class Stack {
    private java.util.ArrayList<Integer> stack;

    public Stack() {
        stack = new java.util.ArrayList<>();
    }

    public void push(int item) {
        stack.add(item);
        System.out.println("Pushed " + item + " onto the stack.");
    }

    public Integer pop() {
        if (!isEmpty()) {
            int item = stack.remove(stack.size() - 1);
            System.out.println("Popped " + item + " from the stack.");
            return item;
        } else {
            System.out.println("Stack is empty. Cannot pop.");
            return null;
        }
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public Integer peek() {
        if (!isEmpty()) {
            int item = stack.get(stack.size() - 1);
            System.out.println("Top item is " + item);
            return item;
        } else {
            System.out.println("Stack is empty.");
            return null;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.peek();
        s.pop();
        s.peek();
        s.pop();
        s.pop();
        s.pop();
    }
}
