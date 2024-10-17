package MathProblems;

import java.util.Arrays;
import java.util.Collections;

public class MaximumSwap {

    public static int maximumSwap(int num) {
        char[] digits = String.valueOf(num).toCharArray();
        Character[] sortedDigits = new Character[digits.length];

        for (int i = 0; i < digits.length; ++i) {
            sortedDigits[i] = digits[i];
        }
        Arrays.sort(sortedDigits, Collections.reverseOrder());

        int digitsPtr = 0;
        int sortedDigitsPtr = 0;

        while (digitsPtr < digits.length && sortedDigitsPtr < sortedDigits.length) {
            if (digits[digitsPtr] != sortedDigits[sortedDigitsPtr]) {
                int maxIndex = findLastOccurrence(digits, sortedDigits[sortedDigitsPtr]);
                char temp = digits[digitsPtr];
                digits[digitsPtr] = digits[maxIndex];
                digits[maxIndex] = temp;
                break;
            }

            digitsPtr++;
            sortedDigitsPtr++;
        }

        return Integer.parseInt(String.valueOf(digits));
    }

    public static int findLastOccurrence(char[] arr, char value) {
        int index = 0;

        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] == value) {
                index = Math.max(index, i);
            }
        }

        return index;
    }

    public static void main(String[] args) {
        System.out.println(maximumSwap(2736)); // 7236
        System.out.println(maximumSwap(9973)); // 9973
        System.out.println(maximumSwap(1993)); // 9913

        System.out.println(maximumSwap(19931227));
    }
}

/*
BEST SOLUTION by ChatGPT
package MathProblems;

import java.util.HashMap;

public class MaximumSwap {

    public static int maximumSwap(int num) {
        char[] digits = String.valueOf(num).toCharArray();
        HashMap<Character, Integer> lastOccurrence = new HashMap<>();

        // Record the last occurrence of each digit
        for (int i = 0; i < digits.length; i++) {
            lastOccurrence.put(digits[i], i);
        }

        for (int i = 0; i < digits.length; i++) {
            // Check for a larger digit to swap with
            for (char d = '9'; d > digits[i]; d--) {
                if (lastOccurrence.containsKey(d) && lastOccurrence.get(d) > i) {
                    // Swap the digits
                    char temp = digits[i];
                    digits[i] = d;
                    digits[lastOccurrence.get(d)] = temp;
                    return Integer.parseInt(String.valueOf(digits)); // Return immediately after swap
                }
            }
        }

        return num; // No swap made, return original number
    }

    public static void main(String[] args) {
        System.out.println(maximumSwap(2736));
        System.out.println(maximumSwap(9973));
        System.out.println(maximumSwap(1993));
        System.out.println(maximumSwap(19931227));
    }
}
 */
