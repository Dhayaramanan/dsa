package Strings;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
//        while (true) {
//            if (s.contains("()")) {
//                s = s.replace("()", "");
//            } else if (s.contains("{}")) {
//                s = s.replace("{}", "");
//            } else if (s.contains("[]")) {
//                s = s.replace("[]", "");
//            } else {
//                return s.isEmpty();
//            }
//        }
        // USing stack
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') stack.push(')');
            else if (c == '{') stack.push('}');
            else if (c == '[') stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("{}"));
        System.out.println(isValid("(]"));
    }
}
