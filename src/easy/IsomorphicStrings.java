package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
205. Isomorphic Strings
https://leetcode.com/problems/isomorphic-strings
 */
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s.equals(t)) {
            return true;
        }
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, List<Integer>> map1 = new HashMap<>();
        HashMap<Character, List<Integer>> map2 = new HashMap<>();

        char[] chars1 = s.toCharArray();
        char[] chars2 = t.toCharArray();
        mapInsertion(chars1, map1);
        mapInsertion(chars2, map2);

        for (int i = 0; i < chars1.length; i++) {
            List<Integer> integers1 = map1.get(chars1[i]);
            List<Integer> integers2 = map2.get(chars2[i]);
            if (!integers1.equals(integers2)){
                return false;
            }
        }
        return true;
    }

    private static void mapInsertion(char[] chars, HashMap<Character, List<Integer>> map1) {
        for (int i = 0; i < chars.length; i++) {
            if (map1.containsKey(chars[i])) {
                List<Integer> positions = map1.get(chars[i]);
                positions.add(i);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map1.put(chars[i], list);
            }
        }
    }
}
