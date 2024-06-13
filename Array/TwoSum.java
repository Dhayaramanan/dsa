package Array;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class TwoSum {
    public static int[] twoSum(int[] nums, int target) {

        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = 1; j < result.length; j++) {
        //         if ((nums[i] + nums[j]) == target) {
        //             result[0] = i;
        //             result[1] = j;
        //             break;
        //         }
        //     }
        // }

        Map<Integer, Integer>  m = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer index1 = m.get(nums[i]);
            if (index1 != null)
                return new int[]{index1, i};
            
            m.put((target - nums[i]), i);
        }

        return nums;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] nums = new int[size];

        for (int i = 0; i < size; ++i) {
            nums[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        for (int i : twoSum(nums, target)) {
            System.out.println(i);
        }

        sc.close();
    }
}