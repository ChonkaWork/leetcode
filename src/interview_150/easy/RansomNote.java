package interview_150.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/*
383. Ransom Note
 */
public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (magazine.length() < ransomNote.length()) {
            return false;
        }
        if (magazine.contains(ransomNote)) {
            return true;
        }

        Map<Character, Long> letterCount = magazine.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        char[] charArray = ransomNote.toCharArray();
        for (char key : charArray) {
            if (!letterCount.containsKey(key)) {
                return false;
            }
            Long count = letterCount.get(key);
            if (count < 1) {
                return false;
            } else {
                letterCount.put(key, count - 1);
            }
        }
        return true;
    }

}
