package Array;


public class MinimumOperationsToMakeAllElementsDivisible {

    public static int minimumOperations(int[] nums) {
        int count = 0;
        for (int i : nums) {
            if (i % 3 != 0) count += 1;
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(minimumOperations(nums));
    }
}
