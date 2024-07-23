package Trees.MaximumDepth;

import java.util.LinkedList;
import java.util.Queue;

// MaximumSumPath.Node class for the binary tree
class Node {
    int data;
    Node left;
    Node right;

    // Constructor to initialize
    // the node with a value
    Node(int val) {
        data = val;
        left = null;
        right = null;
    }
}


public class MaximumDepth {

   public static int maxDepth(Node root) {

        if (root == null) {
            return 0;
        }

        Queue<Node> q = new LinkedList<>();
        int level =0;

        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                Node front = q.poll();

                // Enqueue left child if exists
                if (front.left != null) {
                    q.add(front.left);
                }

                // Enqueue right child if exists
                if (front.right != null) {
                    q.add(front.right);
                }
            }
            // Increment level to
            // move to the next level
            level++;
        }
        // Return the level, which represents
        // the maximum depth of the tree
        return level;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.right = new Node(6);
        root.left.right.right.right = new Node(7);


        int depth = maxDepth(root);

        System.out.println("Maximum depth of " +
                "the binary tree: " + depth);
    }

}
