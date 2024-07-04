package Array;

import java.util.Arrays;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m, j = 0; i < m + n && j < n; ++i, ++j) {
            nums1[i] = nums2[j];
        }
        Arrays.sort(nums1);
    }
    /*
    class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1; // Pointer for nums1
        int p2 = n - 1; // Pointer for nums2
        int mergeIndex = m + n - 1; // Index to merge elements into nums1

        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[mergeIndex--] = nums1[p1--];
            } else {
                nums1[mergeIndex--] = nums2[p2--];
            }
        }

        // Copy remaining elements from nums2 into nums1 if any
        while (p2 >= 0) {
            nums1[mergeIndex--] = nums2[p2--];
        }
    }
}
     */

    public static void main(String[] args) {
    }
}
