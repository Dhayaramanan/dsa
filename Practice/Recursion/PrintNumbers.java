package Practice.Recursion;

import java.util.Scanner;

public class PrintNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // starting number
        int count = in.nextInt(); // next <n> numbers to be printed
        printNumber(n, count);
    }

    public static void printNumber(int n, int count) {
        if (count < 0)
            return;
        System.out.println(n);
        printNumber(n+1, count-1);
    }
}
