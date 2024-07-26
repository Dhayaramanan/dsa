package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class IntersectionOfTwoArraysII {
    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> numsOne = new HashMap<>();

        ArrayList<Integer> result = new ArrayList<>();
        for (int i : nums1) {
            if (!numsOne.containsKey(i)) {
                numsOne.put(i, 1);
            } else {
                numsOne.put(i, numsOne.get(i)+1);
            }
        }

        for (int i : nums2) {
            if (numsOne.get(i) != null && numsOne.get(i) > 0) {
                result.add(i);
                numsOne.replace(i, numsOne.get(i)-1);
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }
}
