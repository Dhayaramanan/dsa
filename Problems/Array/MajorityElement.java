package Array;

import java.util.Arrays;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);

        int count = 1;
        for (int i = 0; i < nums.length-1; ++i) {
            if (nums[i+1] == nums[i])
                count += 1;
            else
                count = 1;

            if (count > nums.length/2)
                return nums[i];
        }
        return nums[0];
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }
}
