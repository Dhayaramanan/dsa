package Array.Matrices;

import java.util.Arrays;

public class ImageSmoother {

    public static int[][] imageSmoother(int[][] img) {
        int[][] result = new int[img.length][img[0].length];

        for (int i = 0; i < img.length; ++i) {
            for (int j = 0; j < img[0].length; ++j) {
                result[i][j] = avgValue(i, j, img);
            }
        }

        return result;
    }

    public static int avgValue(int i, int j, int[][] img) {
        int row_start = i - 1;
        int col_start = j - 1;

        int sum = 0;
        int count = 0;
        for (int r = row_start; r <= row_start + 2; ++r) {
            for (int c = col_start; c <= col_start + 2; ++c) {
                if (r >= 0 && r < img.length && c >= 0 && c < img[0].length) {
                    sum += img[r][c];
                    count++;
                }
            }
        }

        return sum / count;
    }

    public static void main(String[] args) {
        int[][] img = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };

        for (int[] i : imageSmoother(img)) {
            System.out.println(Arrays.toString(i));
        }
    }
}
