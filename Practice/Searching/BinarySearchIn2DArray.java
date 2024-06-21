package Practice.Searching;

import java.util.Arrays;

public class BinarySearchIn2DArray {

    public static void main(String[] args) {
        // row and column wise sorted matrix
        int[][] matrix = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {28, 29, 37, 49},
            {33, 34, 38, 50}
        };

        int target = 34;

        int[] result = binarySearch2D(matrix, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] binarySearch2D(int[][] matrix, int target) {
        int row = 0;
        int col = matrix.length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target)
                return new int[]{row, col};

            if (matrix[row][col] < target)
                row++;
            else
                col--;
        }

        return new int[]{-1, -1};
    }
}