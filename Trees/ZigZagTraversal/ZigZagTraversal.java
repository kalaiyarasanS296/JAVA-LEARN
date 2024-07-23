package Trees.ZigZagTraversal;
import java.util.*;
public class ZigZagTraversal {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int val) {
            data = val;
            left = null;
            right = null;
        }
    }
    // Function to perform zigzag level
    // order traversal of a binary tree
    public static List<List<Integer>> ZigZagLevelOrder(Node root) {

        // result of zigzag traversal
            // Create a list of lists to store levels
        boolean lefttoright = true;
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
                    level.add(node.data);

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
                if(!lefttoright){
                    Collections.reverse(level);

                }
                ans.add(level);
                lefttoright = !lefttoright;

            }
            // Return the level-order
            // traversal of the tree
            return ans;
    }
 public static void printResult(List<List<Integer>> result) {
        for (List<Integer> row : result) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Creating a sample binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.left.left.left = new Node(8);
        root.left.left.right = new Node(9);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(11);
        root.right.left.left = new Node(12);
        root.right.left.right = new Node(13);
        root.right.right.left = new Node(14);
        root.right.right.right = new Node(15);



        // Get the zigzag level order traversal
        List<List<Integer>> result = ZigZagLevelOrder(root);

        // Print the result
        printResult(result);
    }
}



