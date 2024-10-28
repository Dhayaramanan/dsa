package Array;

import java.util.Arrays;
import java.util.HashSet;

public class LongestSquareStreakInAnArray {

    public static int longestSquareStreak(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int longestStreak = 0;

        for (int num : nums) {
            int currentNum = num;
            int currentStreak = 0;

            while (set.contains(currentNum)) {
                currentStreak += 1;

                if (currentNum > Math.sqrt(Integer.MAX_VALUE)) break;
                currentNum = currentNum * currentNum;
            }
            longestStreak = Math.max(longestStreak, currentStreak);
        }
        System.out.println(longestStreak);

        return (longestStreak > 1) ? longestStreak : -1;
    }

    public static void main(String[] args) {
        System.out.println(longestSquareStreak(new int[]{4, 3, 6, 16, 8, 2}));
        System.out.println(longestSquareStreak(new int[]{2, 3, 5, 6, 7}));
    }
}
