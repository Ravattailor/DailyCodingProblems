package daily.code.array;

import java.util.Arrays;

/**
 * Problem Statement :- This problem was recently asked by AirBNB:
 * <p>
 * Given a sorted array, A, with possibly duplicated elements,
 * find the indices of the first and last occurrences of a target element, x.
 * Return -1 if the target is not found.
 * <p>
 * Example:
 * Input: A = [1,3,3,5,7,8,9,9,9,15], target = 9
 * Output: [6,8]
 * <p>
 * Input: A = [100, 150, 150, 153], target = 150
 * Output: [1,2]
 * <p>
 * Input: A = [1,2,3,4,5,6,10], target = 9
 * Output: [-1, -1]
 *
 * Link :- https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 *
 * Solution :- In Single Loop Run to check from start and end  (two pointer)
 *
 * Others :- loop from start and loop from end
 *           binary search
 */
public class FirstLastIndices {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getRange(new int[]{1, 3, 3, 5, 7, 8, 9, 9, 9, 15}, 9))); //Output: [6,8]
        System.out.println(Arrays.toString(getRange(new int[]{100, 150, 150, 153}, 150))); //Output: [1,2]
        System.out.println(Arrays.toString(getRange(new int[]{1, 2, 3, 4, 5, 6, 10}, 9))); //output [-1,-1]
        System.out.println(Arrays.toString(getRange(new int[]{1, 2, 3, 4, 5, 6, 10}, 10))); //output [6,6]
        System.out.println(Arrays.toString(getRange(new int[]{1}, 1))); //output [0,0]
        System.out.println(Arrays.toString(getRange(new int[]{}, 1))); //output [-1,-1]
        System.out.println(Arrays.toString(getRange(new int[]{1}, 0))); //output [-1,-1]
    }

    public static int[] getRange(int[] inputArray, int target) {
        if (inputArray.length == 0) {
            return new int[]{-1, -1};
        } else if (inputArray.length == 1) {
            if(inputArray[0] == target){
                return new int[]{0, 0};
            }else{
                return new int[]{-1, -1};
            }

        } else {
            int outputArray[] = new int[]{-1, -1};
            for (int startIndex = 0, lastIndex = inputArray.length - 1; startIndex <= lastIndex; ) {
                if (outputArray[0] != -1 && outputArray[1] != -1) {
                    break;
                }
                if (inputArray[startIndex] == target) {
                    outputArray[0] = startIndex;
                } else if (outputArray[0] == -1) {
                    startIndex++;
                }
                if (inputArray[lastIndex] == target) {
                    outputArray[1] = lastIndex;
                } else if (outputArray[1] == -1) {
                    lastIndex--;
                }
            }
            return outputArray;
        }
    }
}
