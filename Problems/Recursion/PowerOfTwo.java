package Recursion;

import java.util.Scanner;

public class PowerOfTwo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isPowerOfTwo(n));
    }

    public static boolean isPowerOfTwo(int n) {
        if (n == 1)
            return true;
        if (n == 0 || n%2!=0)
            return false;

        return isPowerOfTwo(n/2);
    }
}

/*
Alternate solution
class Solution {
    public boolean isPowerOfTwo(int n) {
       if (n <= 0) {
        return false;
    }
    return (n & (n - 1)) == 0;
    }
}
 */
