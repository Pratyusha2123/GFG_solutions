class myQueue {
    private int[] arr;
    private int front;
    private int rear;
    private int capacity;
    private int count;
    public myQueue(int n) {
        capacity = n;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        count = 0;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == capacity;
    }

    public void enqueue(int x) {
        if (isFull()) {
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = x;
        count++;
    }

    public void dequeue() {
        if (isEmpty()) {
            return;
        }
        front = (front + 1) % capacity;
        count--;
    }

    public int getFront() {
        if (isEmpty()) {
            return -1;
        }
        return arr[front];
    }

    public int getRear() {
        if (isEmpty()) {
            return -1;
        }
        return arr[rear];
    }
}

public class QueueApp {
    public static void main(String[] args) {
        myQueue q = new myQueue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Front element: " + q.getFront()); 
        System.out.println("Rear element: " + q.getRear());   

        q.dequeue();
        System.out.println("Front element after dequeue: " + q.getFront()); 

        System.out.println("Is queue empty? " + q.isEmpty()); 
        System.out.println("Is queue full? " + q.isFull());   
    }
}