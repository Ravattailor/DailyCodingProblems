package daily.code.strings;

import java.util.Stack;

/**
 * Problem Statement :-
 * This problem was asked by Google.
 *
 * Given a string of parentheses, write a function to compute the minimum number of parentheses to be removed to make the string valid (i.e. each open parenthesis is eventually closed).
 *
 * For example, given the string "()())()", you should return 1. Given the string ")(", you should return 2, since we must remove all of them.
 */
public class MinimumNumberOfParenthesesToBeRemoved {
    public static void main(String[] args) {
        System.out.println(validateParentheses("()())()")); //1
        System.out.println(validateParentheses(")(")); //2
        System.out.println(validateParentheses("(a)())()")); //1
        System.out.println(validateParentheses("")); //0
        System.out.println(validateParentheses("))(")); //3
        System.out.println(validateParentheses(")()()((")); //3

    }

    private static int validateParentheses(String input) {
        if (input.equals("")) {
            return 0;
        } else {
            Stack<Character> characterStack = new Stack<>();
            char[] chars = input.toCharArray();
            int count = 0;
            for (Character character : chars) {
                if (character == '(') {
                    characterStack.push(character);
                } else {
                    //if first bracket is closing bracket
                    if (character == ')' && characterStack.isEmpty()) {
                        count += 1;
                    } else if (character == ')' && characterStack.peek() == '(') {
                        characterStack.pop();
                    } else if(character == ')' || character == '('){
                        // if upper three conditions not satisfied
                        characterStack.push(character);
                    }
                }
            }
            return characterStack.size() == 0 ? count : count+characterStack.size();

        }
    }
}
