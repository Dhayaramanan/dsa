package Array;

import java.util.Scanner;

public class ConcatenationOfArray {

    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * nums.length];

        for (int i = 0; i < nums.length; ++i) {
            ans[i] = ans[i+nums.length] = nums[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int[] nums = new int[size];

        for (int i = 0; i < size; ++i) {
            nums[i] = in.nextInt();
        }

        for (int i : getConcatenation(nums)) {
            System.out.println(i);
        }

        in.close();
    }
}
