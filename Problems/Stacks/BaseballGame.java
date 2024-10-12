package Stacks;

import java.util.Stack;

public class BaseballGame {

    // using array is simple but learned to implement stack
    public static int calPoints(String[] operations) {
        Stack<Integer> result = new Stack<>();

        for (String operation : operations) {
            switch (operation) {
                case "+" -> result.push(result.lastElement() + result.get(result.size() - 2));
                case "C" -> result.pop();
                case "D" -> result.push(2 * result.lastElement());
                default -> result.push(Integer.valueOf(operation));
            }
        }

        return result.stream().mapToInt(Integer::intValue).sum();
    }

    public static void main(String[] args) {
        String[] operations = {"5","2","C","D","+"};
        System.out.println(calPoints(operations));
    }
}
