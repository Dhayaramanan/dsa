package Array.Matrices;

import java.util.Arrays;

public class RichCustomerWealth {
    public static int maximumWealth(int[][] accounts) {
        int max_wealth = 0;
        for (int[] i : accounts) {
            max_wealth = Math.max(Arrays.stream(i).sum(), max_wealth);
        }
        return max_wealth;
    }

    public static void main(String[] args) {
        System.out.println(maximumWealth(new int[][]{{1, 2}, {3, 4}, {5, 6}}));
    }
}
