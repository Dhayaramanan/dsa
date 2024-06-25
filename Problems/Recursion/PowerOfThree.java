package Recursion;

import java.util.Scanner;

public class PowerOfThree {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isPowerOfThree(n));
    }

    public static boolean isPowerOfThree(int n) {
        if (n==1)
            return true;
        if (n <= 0 || n%3 !=0)
            return false;

        return isPowerOfThree(n/3);
    }
}
