package Array.Sorting;

import java.util.Scanner;

public class MissingNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }

        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        int i = 0;

        while (i < nums.length) {
            int correctIndex = nums[i];

            if (nums[i] < nums.length && nums[correctIndex] != nums[i]) swap(nums, correctIndex, i);
            else i++;
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j)
                return j;
        }

        return nums.length;
    }

    public static void swap(int[] nums, int c, int i) {
        int temp = nums[c];
        nums[c] = nums[i];
        nums[i] = temp;
    }
}

/*
BEST SOLUTION

class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int xor1=0;
        int xor2=0;
        for(int i=0;i<n;i++){
            xor1=xor1^i+1;
            xor2=xor2^nums[i];
        }
        return xor1^xor2;
    }
}
 */