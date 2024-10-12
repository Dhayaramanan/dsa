package Stacks;

import java.util.Stack;
import java.util.stream.Collectors;

public class RemoveAllAdjacentDuplicatesInString {

    public static String removeDuplicates(String s) {
        Stack<Character> strings = new Stack<>();

        for (Character c : s.toCharArray()) {
            if (strings.isEmpty()) strings.push(c);
            else
                if (c.equals(strings.lastElement())) strings.pop();
                else strings.push(c);
        }

        return strings.stream().map(String::valueOf).collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbaca"));
        System.out.println(removeDuplicates("azxxzy"));
    }
}
