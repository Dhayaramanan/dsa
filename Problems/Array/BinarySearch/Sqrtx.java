package Array.BinarySearch;

public class Sqrtx {
    public static int mySqrt(int x) {
        int low = 1;
        int high = x;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if ((long)mid * mid == (long)x) return mid;

            if ((long)mid * mid < (long)x) low = mid + 1;
            else high = mid - 1;
        }

        return high;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(10));
    }
}
