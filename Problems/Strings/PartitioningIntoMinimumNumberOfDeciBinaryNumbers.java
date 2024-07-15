package Strings;

/*
the answer is equal to the max digit.
 */

public class PartitioningIntoMinimumNumberOfDeciBinaryNumbers {
    public static int minPartitions(String n) {
        int max = Integer.parseInt(String.valueOf(n.charAt(0)));
        for (int i = 1; i < n.length(); ++i) {
            int val = Integer.parseInt(String.valueOf(n.charAt(i)));
            if (val == 9) {
                max = val;
                break;
            }
            if (val > max) max=val;
        }

        return max;
        /*
        BEST SOLUTION
        for (int i = 9; i>=0; i--) {
            if (n.contains(String.valueOf(i))) return i;
        }
        return 0;
         */
    }

    public static void main(String[] args) {
        System.out.println(minPartitions("123"));
    }
}
