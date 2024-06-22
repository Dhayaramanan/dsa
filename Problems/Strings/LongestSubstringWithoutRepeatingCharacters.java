package Strings;

import java.util.Scanner;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String string = in.nextLine();
        System.out.println(longestSubstring(string));

        in.close();
    }

    public static int longestSubstring(String string) {
        int maxCount = 0;
        int currentCount = 0;
        StringBuilder subString = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            char currentChar = string.charAt(i);
            if (!subString.toString().contains(Character.toString(currentChar))) {
                subString.append(currentChar);
                currentCount++;
            } else {
                int indexOfCharToRemove = subString.indexOf(Character.toString(currentChar));
                subString.replace(0, indexOfCharToRemove+1, "");
                subString.append(currentChar);
                currentCount = subString.length();
            }

            if (currentCount > maxCount)
                maxCount = currentCount;
        }

        return maxCount;
    }
}

/*
BEST SOLUTION

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int end=s.length(),maxlen=0;
        int[] arr=new int[128];
        for(int i=0,j=0;i<end;i++){
            int a=s.charAt(i);
            j=Math.max(j,arr[a]);
            maxlen=Math.max(maxlen,i-j+1);
            arr[a]=i+1;
        }
        return maxlen;

    }
}
 */