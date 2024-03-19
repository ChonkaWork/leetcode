package easy;

/*
977. Squares of a Sorted Array
https://leetcode.com/problems/squares-of-a-sorted-array/description/
 */
public class SortedSquares {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int leftPointer = 0;
        int rightPointer = nums.length - 1;
        int movePointer = result.length - 1;
        while (leftPointer <= rightPointer) {
            if (Math.abs(nums[leftPointer]) > Math.abs(nums[rightPointer])) {
                result[movePointer] = nums[leftPointer] * nums[leftPointer];
                leftPointer++;
            } else {
                result[movePointer] = nums[rightPointer] * nums[rightPointer];
                rightPointer--;
            }
            movePointer--;
        }
        return result;
    }
}
