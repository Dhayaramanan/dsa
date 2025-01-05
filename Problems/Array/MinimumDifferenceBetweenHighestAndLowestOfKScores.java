package Array;

import java.util.Arrays;

public class MinimumDifferenceBetweenHighestAndLowestOfKScores {
    public static int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);

        int minDiff = nums[k-1] - nums[0];
        for (int i = 1; i <= nums.length - k; i++) {
            int diff = nums[i + k - 1] - nums[i];
            minDiff = Math.min(minDiff, diff);
        }

        return minDiff;
    }

    public static void main(String[] args) {
        int[] nums = {9, 4, 1, 7};
        System.out.println(minimumDifference(nums, 2));
    }
}
