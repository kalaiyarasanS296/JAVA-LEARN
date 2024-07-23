import java.util.HashMap;

public class RansomNote {
        public static boolean canConstruct(String ransomNote,
                                           String magazine) {

            HashMap<Character, Integer> dictionary =
                    new HashMap<>();

            for (int i = 0; i < magazine.length(); i++) {
                char c = magazine.charAt(i);

                if (!dictionary.containsKey(c)) {
                    dictionary.put(c, 1);
                } else {
                    dictionary.put(c, dictionary.get(c) + 1);
                }
            }

            for (int i = 0; i < ransomNote.length(); i++) {
                char c = ransomNote.charAt(i);

                // If the character is present in the
                // HashMap and its count is greater than 0,
                // decrement its count by 1
                if (dictionary.containsKey(c) &&
                        dictionary.get(c) > 0) {

                    dictionary.put(c, dictionary.get(c) - 1);
                } else {
                    // If the character is not present
                    // or its count is 0, return false
                    return false;
                }
            }

            // All characters in the ransom note have been
            // processed successfully,
            // so the ransom note can be formed from the magazine
            return true;
        }

    public static void main(String[] args) {
        String ransomNote = "givememoney";
        String magazine = "given the fact, memorize it yen";
        boolean ans = canConstruct(ransomNote,magazine);
        System.out.println(ans);
    }
}

