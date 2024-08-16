package Practice;

import java.util.Arrays;

public class FindSubArrayExactlyAddsToGivenSum {

    public static void main(String[] args) {
        int[] nums = {15, 2, 4, 8, 9, 5, 10, 23};
        int sum = 23;

        System.out.println(Arrays.toString(index(nums, sum)));

        System.out.println(Arrays.toString(index(new int[]{1, 4, 0, 0, 3, 10, 5}, 7)));
        System.out.println(Arrays.toString(index(new int[]{1, 4}, 0)));
    }

    private static int[] index(int[] nums, int sum) {
        int start = 0;
        int end = 1;

        int resultantSum = nums[start] + nums[end];
        while (start < end && end < nums.length) {
            if (resultantSum < sum) {
                end++;
                resultantSum += nums[end];
            }
            else if (resultantSum > sum) {
                resultantSum -= nums[start];
                start++;
            }
            else
                return new int[]{start + 1, end + 1};
        }

        return new int[]{-1, -1};
    }
}
