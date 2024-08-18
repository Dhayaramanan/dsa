package Array;

import java.util.Arrays;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        int maxCount = 0;
        Arrays.sort(nums);

        int count = 0;
        for (int i = 0; i < nums.length-1; ++i) {
            if (nums[i] == nums[i+1])
                continue;
            if (nums[i + 1] - nums[i] == 1)
                count++;
            else
                count = 0;
            maxCount = Math.max(count, maxCount);
        }

        return maxCount+1;
    }

    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{100, 4, 200, 3, 1, 2}));
        System.out.println(longestConsecutive(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1}));
        System.out.println(longestConsecutive(new int[]{2, 1, 3}));
        System.out.println(longestConsecutive(new int[]{1, 2, 1}));
    }
}
