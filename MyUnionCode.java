import java.util.TreeSet;

public class MyUnionCode {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public static ListNode makeUnion(ListNode head1, ListNode head2) {
        TreeSet<Integer> set = new TreeSet<>();
        ListNode curr = head1;
        while (curr != null) {
            set.add(curr.val);
            curr = curr.next;
        }
        curr = head2;
        while (curr != null) {
            set.add(curr.val);
            curr = curr.next;
        }

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        for (int value : set) {
            tail.next = new ListNode(value);
            tail = tail.next;
        }

        return dummy.next;
    }
    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val);
            if (curr.next != null) {
                System.out.print(" -> ");
            }
            curr = curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(5);
        head1.next.next = new ListNode(1);
        head1.next.next.next = new ListNode(2);
        head1.next.next.next.next = new ListNode(2);
        head1.next.next.next.next.next = new ListNode(5);
        ListNode head2 = new ListNode(4);
        head2.next = new ListNode(5);
        head2.next.next = new ListNode(6);
        head2.next.next.next = new ListNode(7);
        head2.next.next.next.next = new ListNode(1);

        System.out.print("List 1: ");
        printList(head1);

        System.out.print("List 2: ");
        printList(head2);
        ListNode result = makeUnion(head1, head2);

        System.out.print("Union:  ");
        printList(result);
    }
}
