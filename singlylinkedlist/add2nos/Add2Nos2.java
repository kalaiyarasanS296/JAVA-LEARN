package singlylinkedlist.add2nos;

public class Add2Nos2 {
    public static Node addTwoNumbers(Node l1, Node l2) {
        Node dummyHead = new Node(0);
        Node tail = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int digit1 = (l1 != null) ? l1.val : 0;
            int digit2 = (l2 != null) ? l2.val : 0;

            int sum = digit1 + digit2 + carry;
            int digit = sum % 10;
            carry = sum / 10;

            Node newNode = new Node(digit);
            tail.next = newNode;
            tail = tail.next;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        Node result = dummyHead.next;
        dummyHead.next = null;
        return result;
    }

    public static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node listNode1 = new Node(9);
        listNode1.next = new Node(4);
        listNode1.next.next = new Node(3);

        Node listNode2 = new Node(5);
        listNode2.next = new Node(6);
        listNode2.next.next = new Node(4);

        Node ans = addTwoNumbers(listNode1,listNode2);
        printLinkedList(ans);

    }
}

