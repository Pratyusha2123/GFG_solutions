class Node {
    int data;
    Node left;
    Node right;
    
    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class Solution {
    public int minValue(Node root) {
        if (root == null) {
            return -1;
        }
        Node current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.data;
    }
}

public class BstMinRunner {
    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(4);
        root.right = new Node(6);
        root.left.left = new Node(3);
        root.left.left.left = new Node(1);
        root.right.right = new Node(7);

        Solution solver = new Solution();
        int minElement = solver.minValue(root);
        
        System.out.println("Minimum element in BST = " + minElement); 
    }
}
