package Strings;

public class FindKthBitInNthBinaryString {

    public static char findKthBit(int n, int k) {
        if (n == 1) return '0';

        return kthBit(n, k);
    }

    private static char kthBit(int n, int k) {
        StringBuilder result = new StringBuilder("0");

        for (int i = 1; i <= n; ++i) {
            result = new StringBuilder(result + "1" + reverse(invert(result)));
        }

        return result.charAt(k-1);
    }

    private static StringBuilder reverse(StringBuilder s) {
        return s.reverse();
    }

    private static StringBuilder invert(StringBuilder s) {
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '1') {
                s.setCharAt(i, '0');
            } else {
                s.setCharAt(i, '1');
            }
        }

        return s;
    }

    public static void main(String[] args) {
        System.out.println(findKthBit(3, 1));
        System.out.println(findKthBit(4, 11));
    }
}
