package Array;

import java.util.Arrays;

public class RangeSumOfSortedSubarraySums {

    public static int rangeSum(int[] nums, int n, int left, int right) {
        int[] subArraySum = new int[(n * (n + 1)) / 2];

        int outPointer = 0;
        int inPointer = 0;
        int sum = 0;
        int index = 0;

        while (outPointer < n) {
            while (inPointer < n) {
                sum += nums[inPointer];
                subArraySum[index] = sum;
                inPointer++;
                index++;
            }
            outPointer++;
            inPointer = outPointer;
            sum = 0;
        }

        Arrays.sort(subArraySum);

        /*
        Range Sum Calculation:
        compute sum of those subarray sums which fall in the given range [left, right] — 1-based indexing.
        So convert it to 0-based indexing for array access.
        Since the result can be large, take modulo (10**9)+7 of the sum.
         */
        int mod = (int) 1e9 + 7;
        int resultSum = 0;
        for (int i = (left - 1); i < right; ++i) {
            resultSum = (resultSum + subArraySum[i]) % mod;
        }

        return resultSum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(rangeSum(nums, 4, 1, 5));
    }
}
