package interview_150.easy;

import java.util.HashMap;
/*
1. Two Sum
https://leetcode.com/problems/two-sum
 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numPositionMap = new HashMap<>();
        numPositionMap.put(nums[0], 0);
        for (int i = 1; i < nums.length; i++) {
            int key = target - nums[i];
            if (numPositionMap.containsKey(key)) {
                return new int[]{numPositionMap.get(key), i};
            } else {
                numPositionMap.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
