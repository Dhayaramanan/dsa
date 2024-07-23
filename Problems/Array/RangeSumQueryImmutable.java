package Array;

class NumArray {
    private int[] nums;
    public NumArray(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int left, int right) {
        int sum = 0;
        for (int i = left; i <= right; ++i) {
            sum += nums[i];
        }
        return sum;
    }
}

public class RangeSumQueryImmutable {
    public static void main(String[] args) {
        NumArray num = new NumArray(new int[]{-2, 0, 3, -5 , 2, 1});
        System.out.println(num.sumRange(0, 2));
    }
}
