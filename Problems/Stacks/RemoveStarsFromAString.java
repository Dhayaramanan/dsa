package Stacks;

import java.util.Stack;

public class RemoveStarsFromAString {
    public static String removeStars(String s) {
        Stack<Character> sChars = new Stack<>();

        for (char i : s.toCharArray()) {
            if (i == '*' && !sChars.isEmpty()) {
                sChars.pop();
            } else {
                sChars.push(i);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!sChars.isEmpty()) {
            sb.append(sChars.pop());
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(removeStars("leet**cod*e"));
        System.out.println(removeStars("**eee*"));
        System.out.println(removeStars("erase*****"));
    }
}
