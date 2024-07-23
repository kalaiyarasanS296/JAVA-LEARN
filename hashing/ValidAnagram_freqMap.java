public class ValidAnagram_freqMap {
        public static boolean isAnagram(String s, String t) {
            if (s.length() != t.length()) {
                return false; // If lengths are different,
                // they cannot be anagrams
            }
            int arr[] = new int[26];

            for(int i=0; i<s.length(); i++){
                arr[s.charAt(i) - 'a']++;
            }

            for(int i=0; i<t.length(); i++){
                arr[t.charAt(i) - 'a']--;
            }

            for(int num: arr){
                if(num != 0){
                    return false;
                }
            }
            return true;
        }
    public static void main(String[] args) {
            String s = "anagram", t = "nagaram";
            boolean ans = isAnagram(s,t);
        System.out.println(ans);
    }
}
