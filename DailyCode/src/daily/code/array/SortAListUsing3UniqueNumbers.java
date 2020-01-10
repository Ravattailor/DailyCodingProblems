package daily.code.array;

import java.util.Arrays;

/**
 * Problem Statement :- This problem was recently asked by Google:
 * <p>
 * Given a list of numbers with only 3 unique numbers (1, 2, 3), sort the list in O(n) time.
 * <p>
 * Example 1:
 * Input: [3, 3, 2, 1, 3, 2, 1]
 * Output: [1, 1, 2, 2, 3, 3, 3]
 * def sortNums(nums):
 * # Fill this in.
 * <p>
 * print sortNums([3, 3, 2, 1, 3, 2, 1])
 * # [1, 1, 2, 2, 3, 3, 3]
 * <p>
 * Challenge: Try sorting the list using constant space.
 */
public class SortAListUsing3UniqueNumbers {

    public static void main(String[] args) {
        printSortNums(new int[]{3, 3, 2, 1, 3, 2, 1});
    }

    private static void printSortNums(int[] nums) {
        int[] c = new int[4];

        for(int i = 0; i < nums.length; i ++) {
            c[nums[i]]++;
        }

        for(int i = 0, j = 0; i < c.length; i ++) {
            while(c[i] > 0) {
                nums[j ++] = i;
                c[i] --;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

}
