public class DetectLoopSlowFast {
        // Function to detect a loop in a linked list
        // using the Tortoise and Hare Algorithm
        public static boolean detectCycle(Node head) {
            // Initialize two pointers, slow and fast,
            // to the head of the linked list
            Node slow = head;
            Node fast = head;

            // Step 2: Traverse the linked list
            // with the slow and fast pointers
            while (fast != null && fast.next != null) {
                // Move slow one step
                slow = slow.next;
                // Move fast two steps
                fast = fast.next.next;

                // Check if slow and fast pointers meet
                if (slow == fast) {
                    return true;  // Loop detected
                }
            }

            // If fast reaches the end of the
            // list, there is no loop
            return false;
        }


        public static void main(String[] args) {
            // Create a sample linked list
            // with a loop for testing
            Node head = new Node(1);
            Node second = new Node(2);
            Node third = new Node(3);
            Node fourth = new Node(4);
            Node fifth = new Node(5);

            head.next = second;
            second.next = third;
            third.next = fourth;
            fourth.next = fifth;
            // Create a loop
            fifth.next = third;

            // Check if there is a loop
            // in the linked list
            if (detectCycle(head)) {
                System.out.println("Loop detected in the linked list.");
            } else {
                System.out.println("No loop detected in the linked list.");
            }
        }
    }
