package Practice.Sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 3};
        System.out.println("Before Sorting: " + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("After Sorting: " + Arrays.toString(arr));
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int last = array.length - i - 1;
            int maxIndex = getMaxIndex(array, 0, last);
            swap(array, maxIndex, last);
        }
    }

    public static int getMaxIndex(int[] array, int start, int end) {
        int max = start;

        for (int i = start; i <= end; ++i) {
            if (array[max] < array[i]) max = i;
        }

        return max;
    }

    public static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
