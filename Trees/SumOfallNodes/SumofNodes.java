package Trees.SumOfallNodes;


public class SumofNodes {
    static int sum = 0;
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int x) {
            data = x;
            left = null;
            right = null;
        }
    }
    public static void inorder(Node root) {

        if (root == null) {
            return;
        }

        sum = sum + root.data;
        inorder(root.left);
        inorder(root.right);
    }


    public static void main(String[] args) {
        // Create the binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);


        inorder(root);
        System.out.println("Total addition of all nodes " + sum);
    }

}
