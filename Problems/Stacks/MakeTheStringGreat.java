package Stacks;

import java.util.Stack;

public class MakeTheStringGreat {

    public static String makeGood(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && Math.abs(stack.peek() - c) == 32) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        StringBuilder result = new StringBuilder();
        for (Character c : stack) {
            result.append(c);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(makeGood("leEeetcode"));
        System.out.println(makeGood("abBAcC"));
        System.out.println(makeGood("s"));
    }
}
