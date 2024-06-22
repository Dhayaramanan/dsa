package Practice.Searching;

import java.util.Arrays;

public class BinarySearchSortedArray2D {
    
    public static void main(String[] args) {
        int[][] m = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        int target = 2;
        System.out.println(Arrays.toString(binarySearchSortedArray(m, target)));
    }

    public static int[] binarySearchSortedArray(int[][] m, int target) {

        int row = m.length;
        int col = m[0].length;

        if (row == 1)
            return binarySearch(m, 0, 0, col-1, target);
        
        // run loop till two rows are remaining
        int rowStart = 0;
        int rowEnd = row - 1;
        int midCol = col / 2;

        // while this is true it will have more than two rows
        while (rowStart < (rowEnd - 1)) {
            int mid = rowStart + (rowEnd - rowStart) / 2;

            if (m[mid][midCol] == target)
                return new int[]{mid, midCol};
            
            if (m[mid][midCol] < target)
                rowStart = mid;
            else
                rowEnd = mid;
        }

        if (m[rowStart][midCol] == target)
            return new int[]{rowStart, midCol};
        
        if (m[rowStart + 1][midCol] == target)
            return new int[]{rowStart - 1, midCol};

        // search in 1st half


        // search in 2nd half
        // search in 3rd half
        // search in 4th half

        return new int[]{-1, -1};
    }
    

    // search in row provided between columns provided
    public static int[] binarySearch(int[][] arr, int row, int colStart, int colEnd, int target) {
        while (colStart <= colEnd) {
            int mid = colStart + (colEnd - colStart) / 2;

            if (arr[row][mid] == target)
                return new int[]{row, mid};
            
            if (arr[row][mid] < target)
                colStart = mid + 1;
            else
                colEnd = mid - 1;
        }

        return new int[]{-1, -1};
    }


}
