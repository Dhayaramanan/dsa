package Array;

public class NumberOfGoodPairs {

    public static int numIdenticalPairs(int[] nums) {
        int[] arr = new int[nums.length+1];

        for (int i : nums) {
            arr[i] += 1;
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count += (arr[i] * (arr[i] - 1)) / 2;
        }

        return count;
    }

    public static void main(String[] args) {
//        int[] nums = {1, 2, 3, 1, 1, 3};
//        System.out.println(numIdenticalPairs(nums));

        int[] nums2 = {4, 4, 2, 2};
        System.out.println(numIdenticalPairs(nums2));
    }
}
