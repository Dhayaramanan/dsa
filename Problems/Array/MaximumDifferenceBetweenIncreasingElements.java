package Array;

public class MaximumDifferenceBetweenIncreasingElements {
    public static int maximumDifference(int[] nums) {
        int max_diff = -1;
        int min = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (min >= nums[i]) min = nums[i];
            else {
                int diff = nums[i] - min;
                max_diff = Math.max(diff, max_diff);
            }
        }

        return max_diff;
    }

    public static void main(String[] args) {
        System.out.println(maximumDifference(new int[]{7, 1, 5, 4}));
    }
}
