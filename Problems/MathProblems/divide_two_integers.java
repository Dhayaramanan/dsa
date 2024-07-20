package MathProblems;

public class divide_two_integers {
    public static int divide(long dividend, long divisor) {
        long quotient = dividend / divisor;

        System.out.println(quotient);
        if (quotient > (Math.pow(2, 31)-1))
            return (int)Math.pow(2, 31);
        if (quotient < -(Math.pow(2, 31)))
            return (int)Math.pow(2, 31);
        if (quotient == -Math.pow(2, 31))
            return (int)quotient;
        return (int)quotient;
    }

    public static void main(String[] args) {
        System.out.println(divide(-2147483648, -1));
    }
}
