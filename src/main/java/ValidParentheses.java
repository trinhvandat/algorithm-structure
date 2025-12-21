import java.util.List;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
//        System.out.println("Result: " + isValid("()"));
//        System.out.println("Result: " + isValid("()[]{}"));
//        System.out.println("Result: " + isValid("(]"));
//        System.out.println("Result: " + isValid("([])"));
//        System.out.println("Result: " + isValid("([)]"));
//        System.out.println("Result: " + isValid("]"));
        System.out.println("Result: " + isValid("){"));
    }

    private static boolean isValid(String s) {

        List<Character> openStack = List.of('(', '{', '[');
        List<Character> closeStack = List.of(')', '}', ']');

        if (s == null || s.isEmpty()) {
            return true;
        }

        if (s.length() % 2 == 1) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        Character currentChar;
        for (int index = 0; index < s.length(); index ++) {
            currentChar = s.charAt(index);
            System.out.println("Current char: " + currentChar);
            if (openStack.contains(currentChar)) {
                stack.push(s.charAt(index));
            }
            if (closeStack.contains(currentChar)) {
                if (stack.isEmpty()) {
                    return false;
                }
                else if (stack.lastElement() == getOpenChar(currentChar)) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private static Character getOpenChar(Character character) {
        return switch (character) {
            case '}' -> '{';
            case ')' -> '(';
            case ']' -> '[';
            default -> throw new IllegalStateException();
        };
    }
}
