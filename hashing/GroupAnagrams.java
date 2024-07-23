import java.util.*;

public class GroupAnagrams {
        public List<List<String>> groupAnagrams(String[] strs) {
            if (strs.length == 0 || strs == null) {
                // return an empty ArrayList
                return new ArrayList<>();
            }

            Map<String, List<String>> map = new HashMap<>();

            for (String str : strs) {
                char[] charArray = str.toCharArray();
                Arrays.sort(charArray);
                String sortedStr = new String(charArray);

                if (!map.containsKey(sortedStr)) {
                    map.put(sortedStr, new ArrayList<>());
                }
                map.get(sortedStr).add(str);
            }

            return new ArrayList<>(map.values());
        }
    }

