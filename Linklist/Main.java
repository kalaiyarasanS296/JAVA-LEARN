package Linklist;

public class Main {
    public static void main(String[] args) throws Exception {
        implementation_linkedlist ll = new
                implementation_linkedlist();
        ll.addlast(10);
        ll.addlast(30);
        ll.addlast(40);
        ll.addlast(50);

        ll.display();
        System.out.println("Removing last **********");
        ll.removelast();
        ll.display();

        System.out.println("Removing at index 2 ************");
        ll.removeat(2);
        ll.display();

        //System.out.println("*****************");
        //System.out.println(ll.getAt(3));
//        ll.addfirst(100);
//        ll.addlast(40);
//        ll.addfirst(20);
//        System.out.println(ll.getfirst());
//        System.out.println(ll.getlast());
//        System.out.println("***************");
//
//        ll.display();
//        ll.removeat(2);
//        ll.removefirst();
//        System.out.println("after removal");
//        ll.display();
    }
}
