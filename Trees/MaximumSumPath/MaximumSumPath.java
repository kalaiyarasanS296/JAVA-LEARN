package Trees.MaximumSumPath;
// Importing necessary packages

// Node structure for the binary tree
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

public class MaximumSumPath{
    static int maximum = 0;
    public static int findMaxPathSum(Node root) {
        // Base case: If the current node is null, return 0
        if (root == null) {
            return 0;
        }

        // Calculate the maximum path sum
        // for the left and right subtrees
        int leftMaxPath = Math.max(0, findMaxPathSum(root.left));
        int rightMaxPath = Math.max(0, findMaxPathSum(root.right));

        maximum = Math.max(maximum, leftMaxPath + rightMaxPath + root.data);

        // Return the maximum sum considering
        // only one branch (either left or right)
        // along with the current node
        return Math.max(leftMaxPath, rightMaxPath) + root.data;
    }

    // Function to find the maximum
    // path sum for the entire binary tree

    public static void main(String[] args) {
        // Creating a sample binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.right = new Node(6);
        root.left.right.right.right = new Node(7);


        // Finding and printing the maximum path sum
        int maxPathSum = maximum;
        System.out.println("Maximum Path Sum: " + maxPathSum);
    }
}

