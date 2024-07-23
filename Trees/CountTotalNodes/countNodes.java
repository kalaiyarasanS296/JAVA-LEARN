package Trees.CountTotalNodes;

public class countNodes {
    static int count = 0;
    static class Node {
        int val;
        Node left;
        Node right;

        public Node(int x) {
            val = x;
            left = null;
            right = null;
        }
    }
        public static void traverse(Node root) {
            // Base case: If the current
            // node is null, return
            if (root == null) {
                return;
            }

            count++;
            traverse(root.left);
            traverse(root.right);
        }


        public static void main(String[] args) {
            // Create the binary tree
            Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            root.left.left = new Node(4);
            root.left.right = new Node(5);
            root.right.left = new Node(6);

            traverse(root);
            System.out.println("Total number of nodes " + count);
        }
    }
