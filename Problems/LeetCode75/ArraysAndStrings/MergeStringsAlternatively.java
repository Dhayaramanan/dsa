package LeetCode75.ArraysAndStrings;

public class MergeStringsAlternatively {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int w1Index = 0;
        int w2Index = 0;

        int min_distance = Math.min(word1.length(), word2.length());

        for (int i = 0; i < min_distance; ++i) {
            result.append(word1.charAt(i));
            result.append(word2.charAt(i));
            w1Index++;
            w2Index++;
        }

        if (w1Index != word1.length()) {
            while (w1Index < word1.length()) {
                result.append(word1.charAt(w1Index));
                w1Index++;
            }
        } else {
            while (w2Index < word2.length()) {
                result.append(word2.charAt(w2Index));
                w2Index++;
            }
        }

        return result.toString();
    }

    /*
    Best solution

    class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder b = new StringBuilder();

        int i = 0, j = 0;
        int m = word1.length();
        int n = word2.length();

        for(; i < m || j < n; ){
            if( i < m ) b.append(word1.charAt(i++));

            if( j < n ) b.append(word2.charAt(j++));
        }

        return b.toString();
    }
}
     */

    public static void main(String[] args) {
        System.out.println(mergeAlternately("123", "456"));
    }
}
