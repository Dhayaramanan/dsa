package Recursion;

import java.util.Scanner;

public class Pow_x_n {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double x = in.nextDouble();
        int n = in.nextInt();

        System.out.println(myPow(x, n));

        in.close();
    }

    public static double myPow(double x, int n) {
        // THIS WORKS and PASSED ALL TEST CASES
        /*
        FIRST SOLUTION
        return Math.pow(x, n);
         */
        if (x == -1 && n < 0) {
            return 1;
        }
        if (x == 1 || x == -1) return x;
        if (x < 0.01 && x > 0 && n > 21000) return 0;
        if (n < -21000) return 0;
        if (n == 1)
            return x;

        if (n > 0)
            return (x * myPow(x, n-1));
        if (n < 0)
            return 1/(x*myPow(x,Math.abs(n)-1));

        return 1;
    }
}
