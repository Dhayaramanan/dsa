package MathProblems;

public class ReversedInteger {
    public static int reverse(int x) {
        long rev = 0;
        int n = Math.abs(x);

        while (n > 0) {
            rev = (rev * 10) + (n % 10);
            n /= 10;
        }

        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) return 0;
        if (x < 0) rev = -rev;
        return (int)rev;
    }

    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(reverse(-123));
    }
}
