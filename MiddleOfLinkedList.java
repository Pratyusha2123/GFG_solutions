public class MiddleOfLinkedList {
    static class Node {
        int data;
        Node next;
        
        Node(int x) {
            data = x;
            next = null;
        }
    }
    public int getMiddle(Node head) {
        if (head == null) {
            return -1;
        }
        Node slow = head;
        Node fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
    public static void main(String[] args) {
        MiddleOfLinkedList list = new MiddleOfLinkedList();
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        
        int middle = list.getMiddle(head);
        System.out.println("Middle element: " + middle);
    }
}
