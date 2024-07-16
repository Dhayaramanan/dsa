package Array;

public class ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        
        int yIndex = nums.length/2;

        int resIndex = 0;
        int xIndex = 0;
        while (xIndex < nums.length/2 || yIndex < nums.length) {
            if (resIndex%2 == 0) {
                result[resIndex] = nums[xIndex];
                xIndex++;
            } else {
                result[resIndex] = nums[yIndex];
                yIndex++;
            }
            resIndex++;
        }

        return result;
    }
}
