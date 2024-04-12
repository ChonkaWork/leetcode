package interview_150.easy;
/*
58. Length of Last Word
https://leetcode.com/problems/length-of-last-word/?envType=study-plan-v2&envId=top-interview-150
 */
public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        int wordLength = 0;
        char[] charArray = s.trim().toCharArray();
        for (int i = charArray.length - 1; i >= 0; i--) {
            if (Character.isSpaceChar(charArray[i])) {
                break;
            }
            wordLength++;
        }
        return wordLength;
    }
}
