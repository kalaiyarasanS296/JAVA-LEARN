package singlylinkedlist.removenthnode;

class Node {
    public int data;
    public Node next;

    // Constructor for Node with data and next node
    public Node(int data1, Node next1) {
        data = data1;
        next = next1;
    }

    // Constructor for Node with only data (next set to null)
    public Node(int data1) {
        data = data1;
        next = null;
    }
}
