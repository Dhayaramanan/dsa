package Array;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        computePermutations(nums, 0, result);
        return result;
    }

    private static void computePermutations(int[] nums, int start, List<List<Integer>> result) {
        if (start == nums.length - 1) {
            List<Integer> currentPermutation = new ArrayList<>();

            for (int n : nums) {
                currentPermutation.add(n);
            }

            result.add(currentPermutation);
        } else {
            for (int i = start; i < nums.length; ++i) {
                swap(nums, start, i);
                computePermutations(nums, start+1, result);
                swap(nums, start, i);
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        List<List<Integer>> result = permute(new int[]{1, 2, 3});

        for (List<Integer> rs : result) {
            System.out.println(rs);
        }
    }
}
