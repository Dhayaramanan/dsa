package Array;

import java.util.Scanner;

public class JumpGameII {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; ++i) {
            nums[i] = in.nextInt();
        }

        System.out.println(minimumJumps(nums));
    }

    public static int minimumJumps(int[] nums) {
        int jumps = 0;

        int target = nums.length - 1;
        int reaching_index = 0;
        while (target > 0) {
            for (int i = target - 1; i >= 0; --i) {
                if ((i + nums[i]) >= target) {
                    reaching_index = i;
                }
            }
            target = reaching_index;
            jumps++;
        }

        return jumps;
    }
}

/*
BEST SOLUTION

class Solution {
    public int jump(int[] nums) {
         if(nums==null||nums.length==1) return 0;
    int numberOfJump=0;
	        int pos=0;
	        int lastIndex=nums.length-1;
	        while(nums[pos]+pos<lastIndex) {
                numberOfJump++;

	        	pos=getNextJumpPos(pos,nums);

	        }
	        return ++numberOfJump;
	    }

		private int getNextJumpPos(int pos, int[] nums) {

			int max=pos+1;
			for(int i=pos+1;i<=nums[pos]+pos&&i<nums.length;i++) {
               // System.out.println("(nums[i]"+nums[i]);
				if(nums[i]+i>(nums[max]+max)) {
					max=i;
				}
			}
			return max;
		}
}
 */
