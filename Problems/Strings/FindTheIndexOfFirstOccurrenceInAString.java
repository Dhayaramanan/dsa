package Strings;

import java.util.Scanner;

public class FindTheIndexOfFirstOccurrenceInAString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String haystack = in.nextLine();
        String needle = in.nextLine();

        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        for (int i = 0; i <= haystack.length() - needle.length(); ++i) {
            if (haystack.startsWith(needle, i))
                return i;
        }

        return -1;
    }
}
/*
BEST SOLUTION
class Solution {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
 */
