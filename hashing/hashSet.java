import java.util.*;

public class hashSet {
   public static void main(String args[]){
    HashSet <Integer> hs = new HashSet<>();
    hs.add(1);
    hs.add(2);
    hs.add(3);
    hs.add(3);
    hs.add(1);
    hs.add(3);
    hs.add(4);

    System.out.println(hs);
    System.out.println(hs.contains(5));
    hs.remove(3);
    System.out.println(hs);




   } 
}
