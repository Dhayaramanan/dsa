package LeetCode75.PrefixSum;

public class FindPivotIndex {
    // finding index where sum of elements before and after the index are same
    public static int pivotIndex(int[] nums) {
        int sumBefore = 0;
        int sumAfter = 0;

        // calculating sum after 0th index
        for (int i = 1; i < nums.length; ++i) {
            sumAfter += nums[i];
        }
        if (sumBefore == sumAfter) return 0;

        // calculating sum before and after elements in the index range of
        // 1 to nums.length - 1
        for (int i = 1; i < nums.length - 1; ++i) {
            sumBefore += nums[i-1];
            sumAfter -= nums[i];
            if (sumBefore == sumAfter) return i;
        }

        // calculating sum before and after last index
        sumBefore += nums[nums.length-2];
        sumAfter -= nums[nums.length-1];
        if (sumBefore == sumAfter) return nums.length-1;

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
    }
}
