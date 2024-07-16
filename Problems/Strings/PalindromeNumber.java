package Strings;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        String s_x = Integer.toString(x);
        return s_x.contentEquals(new StringBuilder(s_x).reverse());
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
    }
}
