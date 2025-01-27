package Stacks;

class CustomStack {
    private int[] stack;
    private int tos;
    public CustomStack(int maxSize) {
        stack = new int[maxSize];
        tos = -1;
    }

    public void push(int x) {
        if (tos < stack.length - 1)
            stack[++tos] = x;
    }

    public int pop() {
        if (tos < 0) return -1;
        return stack[tos--];
    }

    public void increment(int k, int val) {
        int limit = Math.min(k, tos + 1);
        for (int i = 0; i < limit; i++) {
            stack[i] += val;
        }
    }
}

public class DesignAStackWithIncrementOperation {
    public static void main(String[] args) {
        CustomStack obj = new CustomStack(3);
        obj.push(3);
        int popped = obj.pop();
        obj.increment(4, 10);
    }
}
