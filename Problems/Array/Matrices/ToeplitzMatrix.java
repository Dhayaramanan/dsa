package Array.Matrices;

public class ToeplitzMatrix {

    public static boolean isToeplitzMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int row = 0;
        int col = 0;

        while (col < cols) {
            if (!allSame(matrix, row, col)) return false;
            col++;
        }

        col = 0;
        row = 1;
        while (row < rows) {
            if (!allSame(matrix, row, col)) return false;
            row++;
        }

        return true;
    }

    public static boolean allSame(int[][] matrix, int row, int col) {
        int val = matrix[row][col];
        while (row < matrix.length && col < matrix[0].length) {
            if (matrix[row][col] != val) return false;
            row++;   // Move down
            col++;   // Move right
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 1, 2, 3},
                {9, 5, 1, 2}
        };
        System.out.println(isToeplitzMatrix(matrix));

        int[][] mat = {
                {1, 2},
                {2, 2}
        };
        System.out.println(isToeplitzMatrix(mat));
    }
}
