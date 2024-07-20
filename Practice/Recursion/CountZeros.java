package Practice.Recursion;

public class CountZeros {
    public static int countZero(int n) {
        return count(n, 0);
    }

    public static int count(int n, int c) {
        if (n == 0) return c;

        if (n%10 == 0) return count(n/10, c+1);
        return count(n/10, c);
    }

    public static void main(String[] args) {
        System.out.println(countZero(30204));
        System.out.println(countZero(10000));
    }
}
