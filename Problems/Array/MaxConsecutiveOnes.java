package Array;

public class MaxConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;

        int maxCount = 0;
        for (int i : nums) {
            if (i ==  1) {
                count++;
                maxCount = Math.max(count, maxCount);
            }
            else count = 0;
        }

        return maxCount;
    }

    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1}));
    }
}
