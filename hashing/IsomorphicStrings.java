import java.util.HashMap;

public class IsomorphicStrings {
        public static boolean isIso(String s, String t){
            HashMap<Character, Character> map1 = new HashMap<>();
            for(int i = 0; i < s.length(); i++){
                if(map1.containsKey(s.charAt(i))){
                    if(t.charAt(i) == map1.get(s.charAt(i))){
                        continue;
                    }
                    else return false;
                }

                else{
                    map1.put(s.charAt(i), t.charAt(i));
                }

            }
            return true;
        }
        public static boolean isIsomorphic(String s, String t) {
            if(s.length() == t.length()){
                return (isIso(s,t) && isIso(t,s));
            }

            return false;
        }

    public static void main(String[] args) {
        String s = "egg", t = "add";
        System.out.println(isIsomorphic(s,t));
    }
}

