package Collections.Map;

import java.util.HashMap;

/*
Remove HashMap Elements
To remove elements from a hashmap, we can use the remove() method.
 */
public class Basics5 {
         public static void main(String[] args) {

            HashMap<Integer, String> languages = new HashMap<>();
            languages.put(1, "Java");
            languages.put(2, "Python");
            languages.put(3, "JavaScript");
            System.out.println("HashMap: " + languages);

            // remove element associated with key 2
            String value = languages.remove(2);
            System.out.println("Removed value: " + value);

            System.out.println("Updated HashMap: " + languages);
        }
    }


