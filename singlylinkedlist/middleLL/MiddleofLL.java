package singlylinkedlist.middleLL;

public class MiddleofLL {

    // Function to find the middle node of a linked list
    static Node findMiddle(Node head) {
        // If the list is empty or has
        // only one element, return the head as
        // it's the middle.
        if (head.next == null) {
            return head;
        }

        Node temp = head;
        int count = 0;

        // Count the number of nodes
        // in the linked list.
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        // Calculate the position of the middle node.
        int mid = count / 2 + 1;

        temp = head;

        while (temp != null) {
            mid = mid - 1;

            // Check if the middle
            // position is reached.
            if (mid == 0){
                // break out of the loop
                // to return temp
                break;
            }
            // Move temp ahead
            temp = temp.next;
        }

        // Return the middle node.
        return temp;
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


