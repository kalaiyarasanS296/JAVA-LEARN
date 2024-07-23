package singlylinkedlist;
public class LinkedList {
    Node head;
    class Node {
        int data;
        Node next;
        Node(int x) // parameterized constructor
        {
            data = x;
            next = null;
        }
    }

    public Node insert(int data) {
        // Creating newNode memory & assigning data value
        Node newNode = new Node(data);
        // assigning this newNode's next as current head node
        newNode.next = head;

        // re-assigning head to this newNode
        head = newNode;

        return head;
    }


    public void display() {
        Node node = head;
        //as linked list will end when Node reaches Null
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println("");
    }

    public void delete() {
        if (head == null) {
            System.out.println("List is empty, not possible to delete");
            return;
        }

        System.out.println("Deleted: " + head.data);

        head = head.next;
    }

}
