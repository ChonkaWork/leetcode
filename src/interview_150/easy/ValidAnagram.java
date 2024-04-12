package interview_150.easy;

import java.util.Map;
import java.util.stream.Collectors;
/*
242. Valid Anagram
https://leetcode.com/problems/valid-anagram/description/?envType=study-plan-v2&envId=top-interview-150
 */
public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Long> characterLongMap = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(character -> character, Collectors.counting()));

        return t.chars().allMatch(value -> {
            if (characterLongMap.containsKey((char) value) && characterLongMap.get((char) value) > 0) {
                characterLongMap.put((char) value, characterLongMap.get((char) value) - 1);
                return true;
            }
            return false;
        });
    }
}
