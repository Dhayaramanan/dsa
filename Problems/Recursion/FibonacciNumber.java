package Recursion;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(fib(n));
    }

    public static int fib(int n) {
        if (n==0 || n==1)
            return n;

        return fib(n-1) + fib(n-2);
    }
}
