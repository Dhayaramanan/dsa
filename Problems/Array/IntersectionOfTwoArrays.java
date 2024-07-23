package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class IntersectionOfTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> numsOne = new HashMap<>();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums1.length; ++i) {
            numsOne.put(nums1[i], i);
        }

        for (int i : nums2) {
            if (numsOne.containsKey(i) && !list.contains(i)) list.add(i);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[] result = intersection(new int[]{1, 2, 3}, new int[]{2, 3, 2});
        System.out.println(Arrays.toString(result));
    }
}
