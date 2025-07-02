package Heaps;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class MaximumSubsequenceScore {
    public static List<List<Integer>> getSubsequences(int[] nums, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, k, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int[] nums, int index, int k,
                                  List<Integer> current, List<List<Integer>> result) {
        if (current.size() == k) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = index; i < nums.length; i++) {
            current.add(nums[i]);
            backtrack(nums, i + 1, k, current, result);  // move forward to preserve order
            current.removeLast();          // backtrack
        }
    }

    public static long maxScore(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> subSequenceNums1 = getSubsequences(nums1, k);
        List<List<Integer>> subSequenceNums2 = getSubsequences(nums2, k);

        long result = Long.MIN_VALUE;

        for (int i = 0; i < subSequenceNums1.size(); i++) {
            List<Integer> n1ithSubsequence = subSequenceNums1.get(i);
            List<Integer> n2ithSubsequence = subSequenceNums2.get(i);
            long sum = n1ithSubsequence.stream().mapToInt(Integer::intValue).sum();
            long min = n2ithSubsequence.stream().mapToInt(Integer::intValue).min().orElse(Integer.MAX_VALUE);

            result = Math.max(result, sum * min);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(maxScore(new int[]{1,3,3,2}, new int[]{2,1,3,4}, 3));
        System.out.println(maxScore(new int[]{4,2,3,1,1}, new int[]{7,5,10,9,6}, 1));
    }

}
/*
    public long maxScore(int[] nums1, int[] nums2, int k) {
        int n = nums1.length;
        int[][] pairs = new int[n][2];

        for (int i = 0; i < n; i++) {
            pairs[i][0] = nums1[i];
            pairs[i][1] = nums2[i];
        }

        // Sort by nums2 descending
        Arrays.sort(pairs, (a, b) -> Integer.compare(b[1], a[1]));

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        long sum = 0, maxScore = 0;

        for (int i = 0; i < n; i++) {
            minHeap.offer(pairs[i][0]);
            sum += pairs[i][0];

            if (minHeap.size() > k) {
                sum -= minHeap.poll();
            }

            if (minHeap.size() == k) {
                maxScore = Math.max(maxScore, sum * (long)pairs[i][1]);
            }
        }

        return maxScore;
    }
 */