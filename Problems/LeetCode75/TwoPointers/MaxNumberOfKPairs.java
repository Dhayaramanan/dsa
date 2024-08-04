package LeetCode75.TwoPointers;

import java.util.Arrays;
import java.util.HashMap;

public class MaxNumberOfKPairs {

    public static int maxOperations(int[] nums, int k) {
        boolean[] remove = new boolean[nums.length];
        Arrays.fill(remove, false);

        int count = 0;

        int outPointer = 0;
        int inPointer = 1;

        while (outPointer < nums.length - 1) {
            while (inPointer < nums.length) {
                if (((nums[outPointer] + nums[inPointer]) == k) && !remove[outPointer] && !remove[inPointer]) {
                    count += 1;
                    remove[outPointer] = true;
                    remove[inPointer] = true;
                }
                inPointer++;
            }
            outPointer++;
            inPointer = outPointer + 1;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(maxOperations(new int[]{1, 2, 3, 4}, 5));
        System.out.println(maxOperations(new int[]{3, 1, 3, 4, 3}, 6));
    }
}

/*
BEST SOLUTION

class Solution {
    public int maxOperations(int[] nums, int k) {
        int count = 0;
        int i = 0;
        int j = nums.length - 1;

        Arrays.sort(nums);

        while (i < j) {
            if (nums[i] + nums[j] == k) {
                ++count;
                ++i;
                --j;
            } else if (nums[i] + nums[j] > k) {
                --j;
            } else {
                ++i;
            }
        }
        return count;
    }
}
 */