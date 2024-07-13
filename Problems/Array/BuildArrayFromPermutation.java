package Array;

public class BuildArrayFromPermutation {

    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < ans.length; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3};
        for (int i : buildArray(nums)) {
            System.out.println(i);
        }
    }
}
