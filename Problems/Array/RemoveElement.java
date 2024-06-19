package Array;

import java.util.Scanner;

public class RemoveElement {

    // SOLUTION CODE STARTS
    public static int removeElement(int[] nums, int val) {
        int count = 0;

        int frontElementIndex = 0;
        int backElementIndex = nums.length - 1;

        while (frontElementIndex <= backElementIndex) {
            if (nums[frontElementIndex] == val) {
                while (nums[frontElementIndex] == nums[backElementIndex] && frontElementIndex != backElementIndex) {
                    backElementIndex--;
                }
                int temp = nums[frontElementIndex];
                nums[frontElementIndex] = nums[backElementIndex];
                nums[backElementIndex] = temp;
                backElementIndex--;
            }
            frontElementIndex++;
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val)
                count++;
        }

        return count;
    } // SOLUTION CODE ENDS: TOO COMPLEX BUT WORKS. NEED TO IMPROVE MY LOGIC BUILDING

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; ++i) {
            nums[i] = in.nextInt();
        }

        int val = in.nextInt();
        System.out.println(removeElement(nums, val));

        in.close();
    }
}

/*
 * BEST SOLUTION
 * 
 *  public int removeElement(int[] nums, int val) {
        int cnt = 0;
        for (int i =0; i<nums.length; i++){
            if (nums[i]!=val){
                nums[cnt] =nums[i];
                cnt+=1;
            }
        }
        return cnt;
    }
 */