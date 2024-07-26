package Array;

public class SingleElementInASortedArray {
    public static int singleNonDuplicate(int[] nums) {
        if (nums.length == 1 || nums[0] != nums[1])
            return nums[0];

        for (int i = 1; i < nums.length-1; ++i) {
            if (nums[i-1] != nums[i] && nums[i+1] != nums[i]) {
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,3};
        System.out.println(singleNonDuplicate(nums));
    }
}
/*
Best solution using binary search

 public int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (mid % 2 == 0 && nums[mid] == nums[mid + 1]) {
                left = mid + 1;
            }
            else if (mid % 2 == 1 && nums[mid] == nums[mid - 1]) {
                left = mid + 1;
            }
            else {
                right = mid;
            }
        }
        return nums[left];
    }
 */
