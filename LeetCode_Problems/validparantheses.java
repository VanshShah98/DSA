import java.util.*;

public class validparantheses {
    public static void main(String[] args) {
        String s = "((";
        System.out.println(isValid2(s));
    }

    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            }
            if (stack.isEmpty()) {
                return false;
            }
            if (s.charAt(i) == ')' && stack.peek() == '(') {
                stack.pop();
            }
            if (s.charAt(i) == '}' && stack.peek() == '{') {
                stack.pop();
            }
            if (s.charAt(i) == ']' && stack.peek() == '[') {
                stack.pop();
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isValid2(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stackopen = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stackopen.push(')');
            } else if (c == '{') {
                stackopen.push('}');
            } else if (c == '[') {
                stackopen.push(']');
            } else if (stackopen.isEmpty() || stackopen.pop() != c) {
                return false;
            }
        }
        return stackopen.isEmpty();
    }
}
