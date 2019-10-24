package daily.code.strings;

import java.util.Stack;

/**
 * Problem Statement :- Asked By Uber
 * <p>
 * Imagine you are building a compiler. Before running any code, the compiler must check that the parentheses in the program are balanced. Every opening bracket must have a corresponding closing bracket. We can approximate this using strings.
 * <p>
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * An input string is valid if:
 * - Open brackets are closed by the same type of brackets.
 * - Open brackets are closed in the correct order.
 * - Note that an empty string is also considered valid.
 * <p>
 * Example:
 * Input: "((()))"
 * Output: True
 * <p>
 * Input: "[()]{}"
 * Output: True
 * <p>
 * Input: "({[)]"
 * Output: False
 *
 * Link :- https://leetcode.com/problems/valid-parentheses/
 */
public class ValidateBalancedParentheses {
    public static void main(String[] args) {
        System.out.println(validateParentheses("((()))")); //true
        System.out.println(validateParentheses("[()]{}")); //true
        System.out.println(validateParentheses("({[)]")); //false
        System.out.println(validateParentheses("()(){(())")); //false
        System.out.println(validateParentheses("")); //true
        System.out.println(validateParentheses("([{}])()")); //true
        System.out.println(validateParentheses("]")); //false
        System.out.println(validateParentheses("(])")); //false

    }

    private static boolean validateParentheses(String input) {
        if (input.equals("")) {
            return true;
        } else {
            Stack<Character> characterStack = new Stack<>();
            char[] chars = input.toCharArray();
            for (Character character : chars) {
                if (character == '(' || character == '{' || character == '[') {
                    characterStack.push(character);
                } else {
                    //if first bracket is closing bracket
                    if(character == ')' || character == '}' || character == ']' ){
                        if(characterStack.isEmpty()) {
                            return false;
                        }
                    }
                    if (character == ')'  && characterStack.peek() == '(') {
                        characterStack.pop();
                    }else if (character == '}'  && characterStack.peek() == '{') {
                        characterStack.pop();
                    }else if (character == ']'  && characterStack.peek() == '[') {
                        characterStack.pop();
                    }else{
                        // if upper three conditions not satisfied
                        characterStack.push(character);
                    }
                }
            }
            return characterStack.isEmpty();

        }
    }
}
