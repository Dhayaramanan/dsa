package Practice;

import java.util.Arrays;

public class PrefixProduct {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr1));
        prefixProduct(arr1);
        System.out.println(Arrays.toString(arr1));

        System.out.println();

        int[] arr2 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr2));
        suffixProduct(arr2);
        System.out.println(Arrays.toString(arr2));
    }

    private static void suffixProduct(int[] arr) {
        for (int i = arr.length - 2; i >= 0; --i) {
            arr[i] *= arr[i + 1];
        }
    }

    private static void prefixProduct(int[] arr) {
        for (int i = 1; i < arr.length; ++i) {
            arr[i] *= arr[i - 1];
        }
    }
}
