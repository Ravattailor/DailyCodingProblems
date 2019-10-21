package daily.code.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Problem Statement :-
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 * <p>
 * Link To Problem :- https://leetcode.com/problems/two-sum/
 */
public class TwoSum {
    public static void main(String[] args) {
        final int[] result = twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString(result));
    }

    // Time Complexity :- O(n)
    // Space Complexity :- O(n+1)
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int count = 0; count < nums.length; count++) {
            int complement = target - nums[count];
            if (map.containsKey(complement) && map.get(complement) != count) {
                return new int[]{map.get(complement), count};
            }
            map.put(nums[count],count);
        }
         return new int[]{-1, -1};
    }
}
