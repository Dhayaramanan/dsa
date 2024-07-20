package Array.BinarySearch;

import java.util.Arrays;

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};
        int left = binSearch(nums, target, true);
        int right = binSearch(nums, target, false);
        res[0] = left;
        res[1] = right;

        return res;
    }

    public int binSearch(int[] nums, int target, boolean searchingLeft) {
        int start = 0;
        int end = nums.length - 1;
        int index = -1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                index = mid;
                if (searchingLeft) end = mid - 1;
                else start = mid + 1;
            }
        }
        return index;
    }
}

public class findFirstAndLastIndex {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.searchRange(new int[]{1, 2, 7, 7, 8, 8, 5}, 8)));
    }
}
