package Array;

import java.util.Arrays;
/*
Return the minimum number of subsequences needed such that
the difference between the maximum and minimum values in each subsequence is at most k
 */
public class PartitionArraySuchThatMaximumDifferenceIsK {
    public static int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int partitionCount = 1;

        int pointer = nums[0];

        for (int num : nums) {
            if (num - pointer <= k) continue;
            pointer = num;
            ++partitionCount;
        }

        return partitionCount;
    }

    public static void main(String[] args) {
        System.out.println(partitionArray(new int[]{2,2,4,5}, 0));
    }
}
