package Strings;

public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        int sP = 0;
        int tP = 0;

        while (sP < s.length() && tP < t.length()) {
            if (s.charAt(sP) == t.charAt(tP)) sP++;
            tP++;
        }

        return sP == s.length();
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbcdf"));
    }
}
