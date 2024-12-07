package Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindTheDifferenceOfTwoArrays {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            set2.add(num);
        }

        List<Integer> unique1 = new ArrayList<>();
        List<Integer> unique2 = new ArrayList<>();

        for (Integer i : set1) {
            if (!set2.contains(i)) unique1.add(i);
        }

        for (Integer i : set2) {
            if (!set1.contains(i)) unique2.add(i);
        }

        List<List<Integer>> result = new ArrayList<>();
        result.add(unique1);
        result.add(unique2);

        return result;

        /*
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) set1.add(num);
        for (int num : nums2) set2.add(num);

        // Create copies to avoid modifying the original sets
        Set<Integer> unique1 = new HashSet<>(set1);
        Set<Integer> unique2 = new HashSet<>(set2);

        unique1.removeAll(set2); // Keep only elements in set1 not in set2
        unique2.removeAll(set1); // Keep only elements in set2 not in set1

        // Convert to lists and return
        return Arrays.asList(new ArrayList<>(unique1), new ArrayList<>(unique2));
         */

        /*
        Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());

        // Compute unique elements
        List<Integer> unique1 = set1.stream()
                                    .filter(num -> !set2.contains(num))
                                    .collect(Collectors.toList());
        List<Integer> unique2 = set2.stream()
                                    .filter(num -> !set1.contains(num))
                                    .collect(Collectors.toList());

        return Arrays.asList(unique1, unique2); // Return result as a list of lists
         */
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};

        List<List<Integer>> result = findDifference(nums1, nums2);
        for (List<Integer> list : result) {
            System.out.println(list);
        }
    }
}
