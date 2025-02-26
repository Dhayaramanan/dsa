package Strings;

import java.util.ArrayList;
import java.util.Arrays;

public class MinimumNumberOfOperationsToMoveAllBallsToEachBox {
    public static int[] operations(String boxes) {
        ArrayList<Integer> zeroesIndex = new ArrayList<>();
        ArrayList<Integer> onesIndex = new ArrayList<>();

        for (int i = 0; i < boxes.length(); i++) {
            if (boxes.charAt(i) == '0') zeroesIndex.add(i);
            else onesIndex.add(i);
        }

        int[] result = new int[boxes.length()];

        for (Integer i : zeroesIndex) {
            int sum = 0;
            for (Integer j : onesIndex) {
                sum += Math.abs(i - j);
            }
            result[i] = sum;
        }

        for (int i = 0; i < onesIndex.size(); i++) {
            int sum = 0;
            for (int j = 0; j < onesIndex.size(); j++) {
                if (i == j) continue;
                sum += Math.abs(onesIndex.get(i) - onesIndex.get(j));
            }
            result[onesIndex.get(i)] = sum;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(operations("110")));
        System.out.println(Arrays.toString(operations("001011")));
    }
}

/*
Better Solution:

package Strings;

import java.util.Arrays;

public class MinimumNumberOfOperationsToMoveAllBallsToEachBox {
    public static int[] operations(String boxes) {
        int n = boxes.length();
        int[] result = new int[n];

        int count = 0, leftOperations = 0;
        // Left to Right Pass
        for (int i = 0; i < n; i++) {
            result[i] = leftOperations;
            if (boxes.charAt(i) == '1') count++;
            leftOperations += count;
        }

        count = 0;
        int rightOperations = 0;
        // Right to Left Pass
        for (int i = n - 1; i >= 0; i--) {
            result[i] += rightOperations;
            if (boxes.charAt(i) == '1') count++;
            rightOperations += count;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(operations("110")));     // Output: [1, 1, 3]
        System.out.println(Arrays.toString(operations("001011")));  // Output: [11, 8, 5, 4, 3, 4]
    }
}
 */
