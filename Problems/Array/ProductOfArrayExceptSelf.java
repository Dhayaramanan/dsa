package Array;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result, 1);
        int current = 1;

        for (int i = 0; i < n; ++i) {
            result[i] *= current;
            current *= nums[i];
        }

        current = 1;

        for (int i = n -1; i >= 0; --i) {
            result[i] *= current;
            current *= nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1, 2, 3, 4})));
    }
}
