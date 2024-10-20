package Array;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> results = new ArrayList<>();
        List<Integer> combination = new ArrayList<>();

        findCombinations(candidates, target, combination, results, 0);
        return results;
    }

    private static void findCombinations(int[] candidates, int target, List<Integer> combination, List<List<Integer>> results, int startIndex) {
        if (target == 0) {
            results.add(new ArrayList<>(combination));
            return;
        }

        for (int i = startIndex; i < candidates.length; ++i) {
            if (candidates[i] <= target) {
                combination.add(candidates[i]);
                findCombinations(candidates, target - candidates[i], combination, results, i);
                combination.removeLast();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(combinationSum(new int[]{2, 3, 6, 7}, 7));
        System.out.println(combinationSum(new int[]{2, 3, 5}, 8));
    }
}
