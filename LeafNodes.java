class LeafNodes {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static void findLeafNodes(Node root) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            System.out.print(root.data + " ");
        }

        findLeafNodes(root.left);
        findLeafNodes(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);

        System.out.print("Leaf Nodes: ");
        findLeafNodes(root);
    }
}
