package Practice.Searching;

public class LinearSearch2DArray {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int target = 5;
        int[] result = linearSearch2D(matrix, target);
        
        for (int i : result) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int[] linearSearch2D(int[][] matrix, int target) {
        for (int row = 0; row < matrix.length; ++row) {
            for (int col = 0; col < matrix.length; ++col) {
                if (matrix[row][col] == target)
                    return (new int[]{row, col});
            }
        }

        return (new int[]{-1, -1});
    }
}
