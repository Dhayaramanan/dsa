package Array.Matrices;

public class TransposeMatrix {

    public static int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        int[][] transposeMatrix = new int[col][row];

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                transposeMatrix[i][j] = matrix[j][i];
            }
        }

        return transposeMatrix;
    }

    public static void main(String[] args) {
        int[][] result = transpose(new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        });

        for (int[] array : result) {
            for (int j : array) {
                System.out.println(j);
            }
        }
    }
}
