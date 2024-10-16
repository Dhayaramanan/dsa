package Stacks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class EvaluateReversePolishNotation {

    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        ArrayList<String> operators = new ArrayList<>(Arrays.asList("+", "-", "*", "/"));

        for (String token : tokens) {
            if (operators.contains(token)) {
                Integer secondOperand = stack.pop();
                Integer firstOperand = stack.pop();

                int result = switch (token) {
                    case "+" -> firstOperand + secondOperand;
                    case "-" -> firstOperand - secondOperand;
                    case "*" -> firstOperand * secondOperand;
                    case "/" -> firstOperand / secondOperand;
                    default -> 0;
                };
                stack.push(result);
            } else {
                stack.push(Integer.valueOf(token));
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        System.out.println(evalRPN(new String[]{"2", "1", "+", "3", "*"}));
        System.out.println(evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));
    }
}
