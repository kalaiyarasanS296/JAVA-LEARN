package Collections.Map;/*
Change HashMap Value
We can use the replace() method to change the
value associated with a key in a hashmap.
 */
import java.util.HashMap;

public class Basics4 {

        public static void main(String[] args) {

            HashMap<Integer, String> languages = new HashMap<>();
            languages.put(1, "Java");
            languages.put(2, "Python");
            languages.put(3, "JavaScript");
            System.out.println("Original HashMap: " + languages);

            // change element with key 2
            languages.replace(2, "C++");
            System.out.println("HashMap using replace(): " + languages);
        }
    }
