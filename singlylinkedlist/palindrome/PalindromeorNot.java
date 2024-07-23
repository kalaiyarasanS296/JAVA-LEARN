package singlylinkedlist.palindrome;

import java.util.Stack;
public class PalindromeorNot {
    public static boolean isPalindrome(Node head) {
        Stack<Integer> st = new Stack<>();
        // Initialize a temporary pointer
        // to the head of the linked list
        Node temp = head;

        // Traverse the linked list and
        // push values onto the stack
        while (temp != null) {
            // Push the data from the
            // current node onto the stack
            st.push(temp.data);
            temp = temp.next;
        }

        // Reset the temporary pointer back
        // to the head of the linked list
        temp = head;

        // Compare values by popping from the stack
        // and checking against linked list nodes
        while (temp != null) {
            if (temp.data != st.peek()) {
                // If values don't match,
                // it's not a palindrome
                return false;
            }

            // Pop the value from the stack
            st.pop();

            // Move to the next node
            // in the linked list
            temp = temp.next;
        }

        // If all values match,
        // it's a palindrome
        return true;
    }



    // Function to print the linked list
    public static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(5);
        head.next.next = new Node(2);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(1);

        // Print the original linked list
        System.out.print("Original Linked List: ");
        printLinkedList(head);

        // Check if the linked list is a palindrome
        if (isPalindrome(head)) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is not a palindrome.");
        }
    }

}
