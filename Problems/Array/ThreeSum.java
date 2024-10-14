package Array;

import java.util.*;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        /*
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length; ++i) {
            List<Integer> intermediate = new ArrayList<>();
            intermediate.add(nums[i]);
            int target = -nums[i];

            Map<Integer, Integer> map = new HashMap<>();
            for (int j = 0; j < nums.length; ++j) {
                if (j == i) continue;
                Integer index1 = map.get(nums[j]);

                if (index1 != null) {
                    intermediate.add(nums[index1]);
                    intermediate.add(nums[j]);

                    Collections.sort(intermediate);
                    if (!result.contains(intermediate)) result.add(intermediate);

                    break;
                }
                map.put((target - nums[j]), j);
            }
        }

        return result;
         */

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length-2; ++i) {
            if (i > 0 && nums[i] == nums[i-1]) continue;

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
        System.out.println(threeSum(new int[]{0, 1, 1}));
        System.out.println(threeSum(new int[]{0, 0, 0}));

        System.out.println(threeSum(new int[]{-1,0,1,2,-1,-4,-2,-3,3,0,4}));
    }
}
