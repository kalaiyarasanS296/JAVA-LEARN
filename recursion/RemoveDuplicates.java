public class RemoveDuplicates {
    static boolean[] map = new boolean[26];
    // to track characters ('a' to 'z')
    public static void removeDuplicates(String str,
                                        int idx,
                                        String newStr
                                        ) {
        if(idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true) {
            // Duplicate found, skip this character
            removeDuplicates(str, idx + 1, newStr);
        } else {
            // Not a duplicate, add it to
            // newStr and mark as seen
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx + 1,
                     newStr + currChar);
        }
    }
    public static void main(String[] args) {
        String ans = "abcdeababcf";
        System.out.println(ans);

        removeDuplicates(ans, 0, "");
    }
}