package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class SingleNumberIII {
    public static int[] singleNumber(int[] nums) {
        Arrays.sort(nums);

        ArrayList<Integer> result = new ArrayList<>();
        int firstPointer = 0;
        int secondPointer = 1;

        while (secondPointer < nums.length) {
            if (nums[firstPointer] == nums[secondPointer]) {
                firstPointer += 2;
                secondPointer += 2;
            } else {
                result.add(nums[firstPointer]);
                firstPointer++;
                secondPointer++;
            }
        }
        if (secondPointer == nums.length) result.add(nums[firstPointer]);

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] nums = {1,2,1,3,2,5};
        System.out.println(Arrays.toString(singleNumber(nums)));
    }
}
