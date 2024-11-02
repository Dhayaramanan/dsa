package Strings;

import java.util.Arrays;

public class CircularSentence {

    public static boolean isCircularSentence(String sentence) {
        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));

        char firstCharInSentence = words[0].charAt(0);
        char lastCharInSentence = words[words.length - 1].charAt(words[words.length - 1].length() - 1);

        if (words.length == 1) {
            return firstCharInSentence == lastCharInSentence;
        }

        if (firstCharInSentence != lastCharInSentence) return false;

        for (int i = 1; i < words.length; ++i) {
            String currentWord = words[i];
            String prevWord = words[i - 1];

            if (!(currentWord.charAt(0) == prevWord.charAt(prevWord.length() - 1)))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isCircularSentence("leetcode exercises sound delightful"));
        System.out.println(isCircularSentence("Leetcode is cool"));
        System.out.println(isCircularSentence("eetcode"));
    }
}
