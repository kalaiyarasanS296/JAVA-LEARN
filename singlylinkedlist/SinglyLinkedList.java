package singlylinkedlist;

import java.lang.*;

public class SinglyLinkedList{
        public static void main(String args[])
        {
            LinkedList ll = new LinkedList();

            ll.insert(6);
            ll.insert(5);
            ll.insert(3);
            ll.insert(4);
            ll.insert(2);
            ll.insert(1);

            ll.display();

            ll.delete();
            ll.delete();

            ll.display();
        }
    }
