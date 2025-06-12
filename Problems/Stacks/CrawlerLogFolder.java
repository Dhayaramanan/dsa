package Stacks;

import java.util.Stack;

public class CrawlerLogFolder {
    /*
    public int minOperations(String[] logs) {
        int steps = 0;
        for (String log : logs) {
            if (log.equals("./")) continue;
            if (log.equals("../") && steps > 0) {
                steps -= 1;
                continue;
            }
            if (!log.equals("../")) steps += 1;
        }

        return steps;
    }
     */

    public static int minOperations(String[] logs) {
        Stack<String> dirs = new Stack<>();
        for (String log : logs) {
            if (log.equals("./")) continue;
            if (log.equals("../") && !dirs.isEmpty()) {
                dirs.pop();
                continue;
            }
            if (!log.equals("../")) dirs.push(log);
        }

        return dirs.size();
    }

    public static void main(String[] args) {
        System.out.println(minOperations(new String[]{"d1/","d2/","../","d21/","./"}));
        System.out.println(minOperations(new String[]{"d1/","d2/","./","d3/","../","d31/"}));
        System.out.println(minOperations(new String[]{"d1/","../","../","../"}));
        System.out.println(minOperations(new String[]{"./","../","./"}));
        System.out.println(minOperations(new String[]{"./","wz4/","../","mj2/","../","../","ik0/","il7/"}));
    }
}
