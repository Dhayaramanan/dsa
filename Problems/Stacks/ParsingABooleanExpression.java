package Stacks;

import java.util.Stack;

public class ParsingABooleanExpression {
    public static boolean parseBoolExpr(String expression) {
        Stack<Character> operators = new Stack<>();
        Stack<Character> operands = new Stack<>();

        for (char operand : expression.toCharArray()) {
            if (operand == '&' || operand == '|' || operand == '!') {
                operators.push(operand);
            } else if (operand == '(' || operand == 't' || operand == 'f' || operand == ',') {
                operands.push(operand);
            } else if (operand == ')') {
                StringBuilder operation = new StringBuilder();

                while (operands.peek() != '(') {
                    operation.append(operands.pop());
                }
                operands.pop();
                operation.append(operators.pop());
                operands.push(parse(operation.reverse()));
            }
        }

        return operands.pop() == 't';
    }

    private static char parse(StringBuilder operation) {
        char result;
        if (operation.charAt(0) == '&') {
            result = parseAnd(operation);
        } else if (operation.charAt(0) == '|') {
            result = parseOR(operation);
        } else {
            result = parseNot(operation);
        }

        return result;
    }

    private static char parseAnd(StringBuilder operation) {
        for (int i = 1; i < operation.length(); i++) {
            if (operation.charAt(i) == 'f') return 'f';
        }

        return 't';
    }

    private static char parseOR(StringBuilder operation) {
        for (int i = 1; i < operation.length(); i++) {
            if (operation.charAt(i) == 't') return 't';
        }

        return 'f';
    }

    private static char parseNot(StringBuilder operation) {
        return (operation.charAt(1) == 't') ? 'f' : 't';
    }

    public static void main(String[] args) {
        System.out.println(parseBoolExpr("&(|(f))"));
        System.out.println(parseBoolExpr("|(f,f,f,t)"));
        System.out.println(parseBoolExpr("!(&(f,t))"));
    }
}
