package daily.code.array;

/**
 * Problem Statement :-  This problem was recently asked by Facebook:
 * <p>
 * Given a list of numbers, where every number shows up twice except for one number, find that one number.
 * <p>
 * Example:
 * Input: [4, 3, 2, 4, 1, 3, 2]
 * Output: 1
 */
public class NonDuplicateNumberInArray {
    public static void main(String[] args) {
        System.out.println("Non Duplicate Number : "+nonDuplicateNumber(new int[]{4, 3, 2, 4, 1, 3, 2}) );
//        System.out.println("Non Duplicate Number : " + nonDuplicateNumber(new int[]{-1, -1, -2}));
    }

    private static int nonDuplicateNumber(int[] input) {
        int a = 0;
        for (int i = 0; i < input.length; i++) {
            a  ^= input[i];
        }
        return a;
    }
}
