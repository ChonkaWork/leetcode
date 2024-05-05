package easy;

/*
https://leetcode.com/problems/count-odd-numbers-in-an-interval-range
 */
public class CountOddsInRange {

    public static int countOdds(int low, int high) {
        int count = (high - low) / 2;
        if (low % 2 != 0 || high % 2 != 0) {
            count++;
        }
        return count;
    }
}
