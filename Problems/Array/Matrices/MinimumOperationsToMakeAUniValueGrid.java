package Array.Matrices;

import java.util.Arrays;

public class MinimumOperationsToMakeAUniValueGrid {

    public static int minOperations(int[][] grid, int x) {
        if (x != 1 && !isTransformationPossible(grid, x)) return -1;

        int[] oneDGrid = sort(grid);
        int target = oneDGrid[oneDGrid.length/2];

        int operations = 0;
        for (int i : oneDGrid) {
            operations += Math.abs(i - target) / x;
        }

        return operations;
    }

    public static int[] sort(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[] result = new int[m * n];
        int index = 0;
        for (int[] i : grid) {
            for (int j : i) {
                result[index++] = j;
            }
        }

        Arrays.sort(result);
        return result;
    }

    public static boolean isTransformationPossible(int[][] grid, int x) {
        int rem = grid[0][0] % x;
        for (int[] i : grid) {
            for (int j : i) {
                if ((j % x) != rem) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] grid = {{2,4},{6,8}};
        int x = 2;

        System.out.println(minOperations(grid, x));

        grid = new int[][]{{1, 5}, {2, 3}};
        x = 1;
        System.out.println(minOperations(grid, x));

        grid = new int[][]{{1, 2}, {3, 4}};
        x = 2;
        System.out.println(minOperations(grid, x));
    }
}
