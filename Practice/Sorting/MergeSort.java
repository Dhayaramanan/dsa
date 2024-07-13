package Practice.Sorting;

import java.util.Arrays;

public class MergeSort {

    public static int[] mergeSort(int[] arr) {
        if (arr.length == 1) return arr;

        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    public static int[] merge(int[] first, int[] second) {
        int[] result = new int[first.length + second.length];

        int firstPointer = 0;
        int secondPointer = 0;
        int resultPointer = 0;

        while (firstPointer < first.length && secondPointer < second.length) {
            if (first[firstPointer] < second[secondPointer]) {
                result[resultPointer] = first[firstPointer];
                firstPointer++;
            } else {
                result[resultPointer] = second[secondPointer];
                secondPointer++;
            }
            resultPointer++;
        }

        // add remaining elements to result array
        while (firstPointer < first.length) {
            result[resultPointer] = first[firstPointer];
            firstPointer++;
            resultPointer++;
        }

        while (secondPointer < second.length) {
            result[resultPointer] = second[secondPointer];
            secondPointer++;
            resultPointer++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {8, 3, 4, 12, 5, 6};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(mergeSort(arr)));
    }
}
