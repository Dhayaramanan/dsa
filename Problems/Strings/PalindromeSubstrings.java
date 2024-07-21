package Strings;

public class PalindromeSubstrings {
    public static int countSubstrings(String s) {
        int count = 0;

        for (int outPointer = 0; outPointer < s.length(); outPointer++) {
            for (int inPointer = outPointer; inPointer < s.length(); inPointer++) {
                String substring = s.substring(outPointer, inPointer + 1);
                String reversed = new StringBuilder(substring).reverse().toString();

                if (substring.toString().equals(reversed)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSubstrings("aba"));
    }
}
