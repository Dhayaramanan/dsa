package Array;

public class FindTheMaximumFactorScoreOfArray {
    public static long maxScore(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return (long) nums[0] * nums[0];
        long factorScore = 0;

        long gcdWithoutRemoving = gcdArray(nums);
        long lcmWithoutRemoving = lcmArray(nums);
        long factorScoreWithoutRemoving = gcdWithoutRemoving * lcmWithoutRemoving;
        for (int i = 0; i < nums.length; ++i) {
            int[] newArr = new int[nums.length - 1];
            int index = 0;

            for (int j = 0; j < nums.length; ++j) {
                if (j != i) {
                    newArr[index++] = nums[j];
                }
            }

            long gcdWithoutI = gcdArray(newArr);
            long lcmWithoutI = lcmArray(newArr);

            long score = gcdWithoutI * lcmWithoutI;

            factorScore = Math.max(factorScore, score);
        }

        return Math.max(factorScore, factorScoreWithoutRemoving);
    }

    public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static long lcm(long a, long b) {
        return Math.abs(a * b) / gcd(a, b);
    }

    public static long gcdArray(int[] nums) {
        long result = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            result = gcd(result, nums[i]);
        }

        return result;
    }

    public static long lcmArray(int[] nums) {
        long result = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            result = lcm(result, nums[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(maxScore(new int[]{2, 4, 8, 16})); // 64 (lcm: 16 gcd : 4 after removing 2)
        System.out.println(maxScore(new int[]{1, 2, 3, 4, 5, 6})); // 60 without removing any element
    }
}
