
import java.util.*;

public class LevelOrderTraversal {
    static class Node {
        int val;
        Node left;
        Node right;

        Node(int x) {
            this.val = x;
            this.left = null;
            this.right = null;
        }
    }


        public static List<List<Integer>> levelOrder(Node root) {
        // Create a list of lists to store levels
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            // If the tree is empty,
            // return an empty list
            return ans;
        }

        // Create a queue to store nodes
        // for level-order traversal
        Queue<Node> q = new LinkedList<>();
        // Push the root node to the queue
        q.add(root);

        while (!q.isEmpty()) {
            // Get the size of the current level
            int size = q.size();
            // Create a list to store
            // nodes at the current level
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                // Get the front node in the queue
                Node node = q.poll();
                // Store the node value
                // in the current level list
                level.add(node.val);

                // Enqueue the child nodes if they exist
                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
            }
            // Store the current level
            // in the answer list
            ans.add(level);
        }
        // Return the level-order
        // traversal of the tree
        return ans;
    }

    public static void printList(List<Integer> list) {
        // Iterate through the
        // list and print each element
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main function
    public static void main(String[] args) {
        // Creating a sample binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);


        // Perform level-order traversal
        List<List<Integer>> result = levelOrder(root);

        System.out.println("Level Order Traversal of Tree:");

        // Printing the level order traversal result
        for (List<Integer> level : result) {
            printList(level);
        }
    }
}




