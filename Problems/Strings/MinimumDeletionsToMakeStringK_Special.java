package Strings;

/*
You are given a string word and an integer k.
We consider word to be k-special if |freq(word[i]) - freq(word[j])| <= k for all indices i and j in the string.
Here, freq(x) denotes the frequency of the character x in word, and |y| denotes the absolute value of y.
Return the minimum number of characters you need to delete to make word k-special.
 */

import java.util.*;

public class MinimumDeletionsToMakeStringK_Special {
    public static int minimumDeletions(String word, int k) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : word.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        List<Integer> frequencies = new ArrayList<>(frequencyMap.values());
        Collections.sort(frequencies);

        int minDeletions = Integer.MAX_VALUE;

        for (int targetFreq : frequencies) {
            int deletions = 0;

            for (int f : frequencies) {
                if (f < targetFreq) deletions += f;
                else if (f > (targetFreq + k)) deletions += (f - targetFreq - k);
            }

            minDeletions = Math.min(deletions, minDeletions);
        }


        return minDeletions;
    }

    public static void main(String[] args) {
        System.out.println(minimumDeletions("aabcaba", 0));
        System.out.println(minimumDeletions("dabdcbdcdcd", 2));
        System.out.println(minimumDeletions("aaabaaa", 2));
    }
}

/*
Best solution

class Solution {
    public int minimumDeletions(String word, int k) {
        int [] freq = new int[26];
        for(int i =0;i<word.length();i++){
            freq[word.charAt(i)-'a']++;
        }
        int deletion = Integer.MAX_VALUE;
        for(int i =0;i<26;i++){
            if(freq[i]==0) continue;
            int delete = 0;
            int curr = freq[i];
            for(int j =0;j<26;j++){
                if(freq[j]==0)continue;
                if(i==j) continue;
                if(freq[j]<curr){
                    delete+=freq[j];
                }
                else if(Math.abs(freq[j]-curr)>k){
                    delete+=Math.abs(freq[j]-curr)-k;
                }
            }
            deletion = Math.min(deletion,delete);
        }
        return deletion;
    }
}
 */