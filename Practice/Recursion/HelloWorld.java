package Practice.Recursion;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // number of times to print the message
        printMessage(n);
        in.close();
    }

    public static void printMessage(int n) {
        if (n == 0)
            return;
        System.out.println(n + " Hello, World");
        printMessage(n-1);
    }
}
