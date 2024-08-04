package LeetCode75.PrefixSum;

public class FindTheHighestAltitude {
    public static int largestAltitude(int[] gain) {
        int[] ps = new int[gain.length + 1];
        ps[0] = 0;
        int max = ps[0];
        for (int i = 1; i < ps.length; ++i) {
            ps[i] = ps[i-1] + gain[i-1];
            if (ps[i] > max) max = ps[i];
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(largestAltitude(new int[]{-5, 3, 4, 1}));
    }
}
