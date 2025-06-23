package MathProblems;

import java.util.ArrayList;
import java.util.List;

public class SumOfKMirrorNumbers {
    public static long kMirror(int k, int n) {
        long sum = 0;
        /* Using BruteForce
        while (n > 0) {
            String iString = String.valueOf(i);
            if (i < 10 || new StringBuilder(iString).reverse().toString().equals(iString)) {
                StringBuilder convertedToBaseK = convertToBaseK(i, k);
                String baseKString = convertedToBaseK.toString();
                String reversed = new StringBuilder(baseKString).reverse().toString();
                if (baseKString.equals(reversed)) {
                    sum += i;
                    n--;
                }
            }

            i++;
        }
        */

        int count = 0;
        int length = 1;
        while (count < n) {
            for (long palindrome : generatePalindromes(length)) {
                StringBuilder convertedToBaseK = convertToBaseK(palindrome, k);
                String baseKString = convertedToBaseK.toString();
                String reversed = new StringBuilder(baseKString).reverse().toString();
                if (baseKString.equals(reversed)) {
                    sum += palindrome;
                    count++;
                    if (count == n) return sum;
                }
            }
            length++;
        }

        return sum;
    }

    public static List<Long> generatePalindromes(int length) {
        List<Long> result = new ArrayList<>();

        int halfLen = (length + 1) / 2;
        long start = (long)Math.pow(10, halfLen - 1);
        long end = (long)Math.pow(10, halfLen);

        for (long i = start; i < end; i++) {
            String firstHalf = String.valueOf(i);
            String fullPalindrome = (length % 2 == 0)
                    ? firstHalf + new StringBuilder(firstHalf).reverse()
                    : firstHalf + new StringBuilder(firstHalf.substring(0, firstHalf.length() - 1)).reverse();
            result.add(Long.parseLong(fullPalindrome));
        }

        return result;
    }

    public static StringBuilder convertToBaseK(long n, int k) {
        StringBuilder result = new StringBuilder();
        while (n > 0) {
            result.append(n%k);
            n /= k;
        }
        return result.reverse();
    }

    public static void main(String[] args) {
        System.out.println(kMirror(2, 5));
        System.out.println(kMirror(3, 7));
        System.out.println(kMirror(7, 17));
    }
}
