package Stacks;

import java.util.Stack;

public class SimplifyPath {

    public static String simplifyPath(String path) {
        String[] namesInPath = path.split("/");
        StringBuilder result = new StringBuilder();

        Stack<String> stack = new Stack<>();

        for (String name : namesInPath) {
            if (name.equals(".") || name.isBlank() || name.isEmpty()) continue;

            if (name.equals("..")) {
                if (!stack.isEmpty()) stack.pop();
                continue;
            }

            stack.push(name);
        }

        for (String s : stack) {
            result.append("/").append(s);
        }

        return result.isEmpty() ? "/" : result.toString();
    }

    public static void main(String[] args) {
        System.out.println(simplifyPath("/home//foo/"));
        System.out.println(simplifyPath("/.../a/../b/c/../d/./"));
        System.out.println(simplifyPath("/../"));
    }
}
