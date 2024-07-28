package LeetCode75.ArraysAndStrings;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNumberOfCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maxValue = candies[0];

        for (int i : candies) {
            maxValue = Math.max(maxValue, i);
        }
        for (int i : candies) {
            if ((i + extraCandies) >= maxValue) result.add(true);
            else result.add(false);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(kidsWithCandies(new int[]{1, 2, 3, 4, 5}, 3));
    }
}
