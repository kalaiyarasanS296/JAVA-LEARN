public class DLL {
    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
        public static Node tail;
        public static int size;

        public void addFirst(int data) {

            Node newNode = new Node(data);
            if(size == 0) {
                head = tail = newNode;
                return;
            }

            head.prev = newNode;
            newNode.next = head;
            head = newNode;
            size++;
        }

    public void addLast(int data) {

        Node newNode = new Node(data);
        if(size == 0) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        size++;
    }

    public int removeLast() {
        if(size == 0) {
            return Integer.MIN_VALUE;
        }
        size--;
        if(head == tail) {
            int val = head.data;
            head = tail = null;
            return val;
        }
        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        return val;
    }


    public void print() {
            Node temp = head;
            while(temp != null) {
                System.out.print(temp.data+"<->");
                temp = temp.next;
            }
            System.out.println("null");
        }

        public int removeFirst() {
            if(size == 0) {
                return Integer.MIN_VALUE;
            }
            size--;
            if(head == tail) {
                int val = head.data;
                head = tail = null;
                return val;
            }
            int val = head.data;
            head = head.next;
            head.prev = null;
            return val;
        }
        public static void main(String args[]) {
        DLL dll = new DLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.print();

//        dll.removeFirst();
//        dll.print();
//        dll.addFirst(1);
//        dll.print();
//
//        System.out.println("*******************");
//        dll.addLast(5);
//        dll.removeLast();
//        dll.print();
    }
}
