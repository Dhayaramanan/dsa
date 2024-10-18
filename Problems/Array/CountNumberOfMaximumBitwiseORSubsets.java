package Array;

import java.util.ArrayList;
import java.util.List;

public class CountNumberOfMaximumBitwiseORSubsets {

    public static int countMaxOrSubsets(int[] nums) {
        List<List<Integer>> subsets = calculateSubsets(nums);

        int maxOR = calculateMaxOR(nums);

        int count = 0;

        for (List<Integer> subset : subsets) {
            if (calculateOR(subset) == maxOR) count += 1;
        }

        return count;
    }

    private static int calculateMaxOR(int[] nums) {
        int maxOR = 0;

        for (int num : nums) {
            maxOR |= num;
        }

        return maxOR;
    }

    private static List<List<Integer>> calculateSubsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        subsets.add(new ArrayList<>());

        for (int num : nums) {
            List<List<Integer>> newSubsets = new ArrayList<>();

            for (List<Integer> curr : subsets) {
                List<Integer> newSubset = new ArrayList<>(curr);
                newSubset.add(num);
                newSubsets.add(newSubset);
            }

            subsets.addAll(newSubsets);
        }

        return subsets;
    }

    private static int calculateOR(List<Integer> subset) {
        int or = 0;

        for (Integer num : subset) {
            or |= num;
        }

        return or;
    }

    public static void main(String[] args) {
        System.out.println(countMaxOrSubsets(new int[]{3, 1}));
        System.out.println(countMaxOrSubsets(new int[]{2, 2, 2}));
        System.out.println(countMaxOrSubsets(new int[]{3, 2, 1, 5}));
    }
}
