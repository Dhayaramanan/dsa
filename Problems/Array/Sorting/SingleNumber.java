package Array.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SingleNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }

        System.out.println(singleNumber(nums));

        in.close();
    }

    // 6ms Runtime
    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);

        int index = 0;

        while (index < nums.length-1) {
            if (nums[index] == nums[index+1])
                index += 2;
            else
                return nums[index];
        }

        return nums[index];
    }
}

/*
BEST SOLUTION - 2ms runtime

class Solution {
        public int singleNumber(int[] nums) {
        int x=nums[0];
        x=find(nums,1,2,x);
        return x;
    }
    public int find(int arr[],int i, int j,int x){
        if(i==arr.length||j==arr.length)return x;

        x=x^arr[i]^arr[j];

        return find(arr,j+1,j+2,x);
    }
}
 */