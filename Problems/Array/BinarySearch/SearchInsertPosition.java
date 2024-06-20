package Array.BinarySearch;

import java.util.Scanner;

public class SearchInsertPosition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Getting essential inputs
        int n = in.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        int target = in.nextInt();
        //input ends

        System.out.println(searchInsertPosition(nums, target));

        in.close();
    }

    // solution code starts
    private static int searchInsertPosition(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = (start + end) / 2;

        while (start <= end) {
            if (nums[mid] == target) return mid;
            
            if (nums[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
            
            mid = (start + end) / 2;
        }

        // if target not found in array then target will be inserted at mid index or mid index + 1
        /*My First Solution
        if (nums[mid] > target)
            return mid;
        
         return (mid+1);
        */
        
        return start; // best solution is to return start index
    }
    // Solution code ends
}
