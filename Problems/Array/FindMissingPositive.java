package Array;

import java.util.Arrays;
import java.util.HashSet;

public class FindMissingPositive {

    public static int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);

        HashSet<Integer> set = new HashSet<>();

        int smallNum = 1;

        for (int num : nums) {
            if (num <= 0)
                continue;

            if (set.contains(num))
                continue;

            if (num != smallNum)
                return smallNum;

            set.add(num);
            smallNum += 1;
        }

        return smallNum;
    }

    public static void main(String[] args) {
        System.out.println(firstMissingPositive(new int[]{1, 2, 0}));
        System.out.println(firstMissingPositive(new int[]{3, 4, -1, 1}));
        System.out.println(firstMissingPositive(new int[]{7, 8, 9, 11, 12}));
        System.out.println(firstMissingPositive(new int[]{0, 2, 2, 1, 1}));
    }
}
