package Array;

public class FindClosestNumberToZero {
    public static int findClosestNumber(int[] nums) {
        int result = nums[0];
        int min_distance = Math.abs(nums[0]);

        for (int i = 0; i < nums.length; ++i) {
            int d = Math.abs(nums[i]);
            if (d < min_distance) {
                result = nums[i];
                min_distance = d;
            }
            if (min_distance == d && nums[i] > result) {
                result = nums[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(findClosestNumber(new int[]{-4, -2, 1, -1, 3}));
    }
}
