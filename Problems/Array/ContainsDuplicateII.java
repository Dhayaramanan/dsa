package Array;

import java.util.HashMap;

public class ContainsDuplicateII {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
            HashMap<Integer, Integer> ele = new HashMap<>();

            for (int i = 0; i < nums.length; ++i) {
                Integer j = ele.get(nums[i]);
                if (j == null)
                    ele.put(nums[i], i);
                else {
                    if (Math.abs(i - j) <= k) {
                        return true;
                    } else {
                        ele.replace(nums[i], i);
                    }
                }
            }
            return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 1};
        System.out.println(containsNearbyDuplicate(nums, 1));
    }
}
