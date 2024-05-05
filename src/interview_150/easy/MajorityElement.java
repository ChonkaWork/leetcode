package interview_150.easy;

import java.util.Arrays;
import java.util.stream.Collectors;

/*
169. Majority Element
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2


Constraints:

n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 109
 */
public class MajorityElement {

    public static int majorityElement(int[] nums) {
        var map = Arrays.stream(nums).boxed()
                .collect(Collectors.groupingBy(num -> num, Collectors.counting()));
        return map.entrySet().stream().filter(n -> n.getValue() >= nums.length / 2).findFirst().orElseThrow().getKey();
    }
}
