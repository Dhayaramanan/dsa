package Practice.Sorting;

import org.jetbrains.annotations.NotNull;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4 ,2};

        bubbleSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void bubbleSort(int @NotNull [] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length - 1; ++i) {
            swapped = false;
            for (int j = 0; j < arr.length - i - 1; ++j) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }

            if (!swapped)
                break;
        }
    }
}
