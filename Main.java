class MyStack {
    private int[] arr;
    private int top;
    private int capacity;
    public MyStack(int n) {
        capacity = n;
        arr = new int[capacity];
        top = -1;
    }
    public boolean isFull() {
        return top == capacity - 1;
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public void push(int x) {
        if (!isFull()) {
            arr[++top] = x;
        }
    }

    // Function to remove the top element from the stack
    public void pop() {
        if (!isEmpty()) {
            top--;
        }
    }

    // Function to return the top element without removing it
    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return arr[top];
    }
}

// Ye main class hai testing ke liye
public class Main {
    public static void main(String[] args) {
        // Example 1 test case: n = 3
        MyStack stack = new MyStack(3);
        
        stack.push(5);
        stack.push(3);
        
        System.out.println("Peek: " + stack.peek()); // Output: 3
        stack.pop();
        System.out.println("Is Empty: " + stack.isEmpty()); // Output: false
        System.out.println("Is Full: " + stack.isFull());   // Output: false
    }
}