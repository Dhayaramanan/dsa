package Array;

public class SubRectangleQueries {
    private final int[][] rect;
    public SubRectangleQueries(int[][] rectangle) {
        this.rect = rectangle;
    }

    public void updateSubRectangle(int row1, int col1, int row2, int col2, int newValue) {
        for (int i = row1; i <= row2; ++i) {
            for (int j = col1; j <= col2; ++j) {
                this.rect[i][j] = newValue;
            }
        }
    }

    public int getValue(int row, int col) {
        return this.rect[row][col];
    }

    public static void main(String[] args) {
        int[][] rectangle = {
                {1, 2, 1},
                {4, 3, 4},
                {3, 2, 1},
                {1, 1, 1}
        };
        SubRectangleQueries object = new SubRectangleQueries(rectangle);
        object.updateSubRectangle(0, 0, 3, 2, 5);
        int val = object.getValue(0, 1);
        System.out.println(val);
    }
}
