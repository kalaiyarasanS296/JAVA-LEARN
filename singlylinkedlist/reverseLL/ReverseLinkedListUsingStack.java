package singlylinkedlist.reverseLL;

import java.util.Stack;

public class ReverseLinkedListUsingStack {
    public static Node reverseLinkedList(Node head) {
        Node temp = head;
        Stack<Integer> stack = new Stack<>();
        while (temp != null) {
            stack.push(temp.data);
            temp = temp.next;
        }
        // Reset the temporary pointer
        // to the head of the linked list
        temp = head;

        // Step 2: Pop values from the stack
        // and update the linked list
        while (temp != null) {
            // Set the current node's data
            // to the value at the top of the stack
            temp.data = stack.pop();
            // Move to the next node
            // in the linked list
            temp = temp.next;
        }
        // Return the new head of
        // the reversed linked list
        return head;
    }

    // Function to print the linked list
    public static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create a linked list with values 1, 3, 2, and 4

        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(2);
        head.next.next.next = new Node(4);

        System.out.println("Linked List before reverse: ");
        printLinkedList(head);

        // Reverse the linked list
       Node ans = reverseLinkedList(head);

        // Print the reversed linked list
        System.out.println("Linked List after reverse: ");
        printLinkedList(ans);
    }
}
