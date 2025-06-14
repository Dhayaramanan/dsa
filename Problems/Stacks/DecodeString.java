package Stacks;

import java.util.Stack;

public class DecodeString {
    public static String decodeString(String s) {
        Stack<Character> result = new Stack<>();
        Stack<Integer> integers = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                if (Character.isDigit(c)) {
                    int num = 0;
                    // collect full number (e.g., 100)
                    while (i < s.length() && Character.isDigit(s.charAt(i))) {
                        num = num * 10 + (s.charAt(i) - '0');
                        i++;
                    }
                    integers.push(num);
                    i--; // step back because outerloop does i++
                    continue;
                }
            }

            if (c != ']') result.push(c);
            else {
                StringBuilder temp = new StringBuilder();
                char tmp = result.pop();
                while (tmp != '[') {
                    temp.append(tmp);
                    tmp = result.pop();
                }
                temp.reverse();

                for (int k = integers.pop(); k > 0; k--) {
                    for (char j : temp.toString().toCharArray()) {
                        result.push(j);
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!result.isEmpty()) {
            sb.append(result.pop());
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(decodeString("3[a]2[bc]"));
        System.out.println(decodeString("3[a2[c]]"));
        System.out.println(decodeString("2[abc]3[cd]ef"));
    }
}
/*
BETTER SOLUTION
===============

public static String decodeString(String s) {
    Stack<StringBuilder> strStack = new Stack<>();
    Stack<Integer> intStack = new Stack<>();
    StringBuilder current = new StringBuilder();
    int k = 0;

    for (char c : s.toCharArray()) {
        if (Character.isDigit(c)) {
            // Build the full number (could be multiple digits)
            k = k * 10 + (c - '0');
        } else if (c == '[') {
            // Push the current state and reset for nested structure
            intStack.push(k);
            strStack.push(current);
            current = new StringBuilder();
            k = 0;
        } else if (c == ']') {
            StringBuilder decoded = strStack.pop();
            int repeat = intStack.pop();
            for (int i = 0; i < repeat; i++) {
                decoded.append(current);
            }
            current = decoded;
        } else {
            current.append(c);
        }
    }

    return current.toString();
}

 */