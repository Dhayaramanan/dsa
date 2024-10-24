package Array.BinarySearch;

public class FindPeakElement {

    public static int findPeakElement(int[] nums) {
        return searchPeek(nums, 0, nums.length-1);
    }

    private static int searchPeek(int[] nums, int start, int end) {
        if (start == end) return start;

        int mid = (start + end) / 2;

        if (nums[mid] > nums[mid + 1])
            return searchPeek(nums, start, mid);

        return searchPeek(nums, mid+1, end);

    }

    public static void main(String[] args) {
        System.out.println(findPeakElement(new int[]{1, 2, 1, 3, 5, 6, 4}));
    }
}
