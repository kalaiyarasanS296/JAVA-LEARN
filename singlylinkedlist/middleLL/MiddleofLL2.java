package singlylinkedlist.middleLL;

// Node class represents a node in a linked list


 class MiddleofLL2 {

    static Node findMiddle(Node head) {
        // Initialize the slow pointer to the head.
        Node slow = head;

        // Initialize the fast pointer to the head.
        Node fast = head;

        // Traverse the linked list using
        // the Tortoise and Hare algorithm.
        while (fast != null && fast.next != null
                && slow != null) {
            // Move fast two steps.
            fast = fast.next.next;
            // Move slow one step.
            slow = slow.next;
        }
        // Return the slow pointer,
        // which is now at the middle node.
        return slow;
    }


    public static void main(String[] args) {
        // Creating a sample linked list:
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Find the middle node
        Node middleNode = findMiddle(head);

        // Display the value of the middle node
        System.out.println("The middle node value is: " + middleNode.data);
    }
}



