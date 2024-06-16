package Array;

import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray {

    // Solution Code Starts
    public static int removeDuplicates(int[] nums) {
        int original = 0;
        int duplicate = 0;
        int next = 0;

        while ((original < nums.length) && (duplicate < nums.length)) {
            if (nums[original] == nums[duplicate])
                ++duplicate;
            else {
                nums[++next] = nums[duplicate];
                original = duplicate;
                duplicate = original + 1;
            }
        }

        return next+1;
    } // Solution Code ends

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }

        System.out.println(removeDuplicates(nums));

        in.close();
    }
}

/*
 * BEST SOLUTION
 * 
 * class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int j = 1;
        for(int i = 1;i<n;i++){
            if(nums[i]!=nums[i-1]){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
        
    }
}
 */
