package Practice.Sorting;

import java.util.Arrays;

public class CyclicSort {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 2, 1, 4};
        System.out.println(Arrays.toString(arr));
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void cyclicSort(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            int correct = arr[i] - 1;

            if (arr[correct] != arr[i]) swap(arr, i, correct);
            else i++;
        }
    }

    private static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
