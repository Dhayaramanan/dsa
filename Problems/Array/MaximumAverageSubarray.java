package Array;

import java.util.Arrays;

public class MaximumAverageSubarray {
    public static double findMaxAverage(int[] nums, int k) {
        double maxAverage;

        if (nums.length == 1) {
            return nums[0];
        }

        double initialSum = Arrays.stream(Arrays.copyOfRange(nums, 0, k)).sum();
        double average = initialSum/k;
        maxAverage = average;
        for (int i = 1; i <= nums.length - k; ++i) {
            initialSum += nums[i+k-1] - nums[i-1];
            average = initialSum/k;
            if (average > maxAverage)
                maxAverage = average;

        }

        return maxAverage;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 12, -5, -6, 50, 3};
        System.out.println(findMaxAverage(nums1, 4));

        int[] nums2 = {-1};
        System.out.println(findMaxAverage(nums2, 1));
    }
}
