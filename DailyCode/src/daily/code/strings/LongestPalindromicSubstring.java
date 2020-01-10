package daily.code.strings;

/**
 * Problem Statement :- Asked By Twitter
 * <p>
 * A palindrome is a sequence of characters that reads the same backwards and forwards.
 * Given a string, s, find the longest palindromic substring in s.
 * <p>
 * Solution Approach :-
 */
public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        System.out.println(longestPalindromicSubstring("banana")); //output:- anana
        System.out.println(longestPalindromicSubstring("million")); //output:- illi
        System.out.println(longestPalindromicSubstring("tracecars")); //output :-racecar
        System.out.println(longestPalindromicSubstring("a")); //output :- a
        System.out.println(longestPalindromicSubstring("ac")); //output :- a
        System.out.println(longestPalindromicSubstring("aa")); //output :- aa
        System.out.println(longestPalindromicSubstring("abcda")); //output :- a
        System.out.println(longestPalindromicSubstring("")); //output :-
    }

    private static String longestPalindromicSubstring(String input) {
    return  "";
    }
}
