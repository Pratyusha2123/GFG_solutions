public class TestMerge {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
    public static Node sortedMerge(Node head1, Node head2) {
        Node dummyNode = new Node(-1);
        Node curr = dummyNode;
        
        Node p1 = head1;
        Node p2 = head2;
        
        while (p1 != null && p2 != null) {
            if (p1.data <= p2.data) {
                curr.next = p1;
                p1 = p1.next;
            } else {
                curr.next = p2;
                p2 = p2.next;
            }
            curr = curr.next;
        }
        
        if (p1 != null) {
            curr.next = p1;
        } else {
            curr.next = p2;
        }
        
        return dummyNode.next;
    }

    // Print list helper
    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data);
            if (curr.next != null) {
                System.out.print(" -> ");
            }
            curr = curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head1 = new Node(5);
        head1.next = new Node(10);
        head1.next.next = new Node(15);
        head1.next.next.next = new Node(40);
        Node head2 = new Node(2);
        head2.next = new Node(3);
        head2.next.next = new Node(20);

        System.out.print("List 1: ");
        printList(head1);

        System.out.print("List 2: ");
        printList(head2);

        Node mergedHead = sortedMerge(head1, head2);

        System.out.print("Merged: ");
        printList(mergedHead);
    }
}
