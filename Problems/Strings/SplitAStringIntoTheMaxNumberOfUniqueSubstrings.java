package Strings;

import java.util.ArrayList;
import java.util.HashSet;

public class SplitAStringIntoTheMaxNumberOfUniqueSubstrings {

//    public static int maxUniqueSplit(String s) {
//        ArrayList<String> uniqueSubsets = new ArrayList<>();
//
//        int i = 0;
//        while (i < s.length()) {
//            String currentChar = String.valueOf(s.charAt(i));
//            if (!(uniqueSubsets.contains(currentChar))) {
//                uniqueSubsets.add(currentChar);
//            } else {
//                i++;
//                StringBuilder result = new StringBuilder(currentChar);
//
//                while (i < s.length() && uniqueSubsets.contains(result.toString())) {
//                    result.append(s.charAt(i));
//                    i++;
//                }
//                if (!(uniqueSubsets.contains(result.toString()))) uniqueSubsets.add(result.toString());
//                continue;
//            }
//
//            i++;
//        }
//
//        System.out.println(uniqueSubsets);
//
//        return uniqueSubsets.size();
//    }

    public static int maxUniqueSplit(String s) {
        HashSet<String> uniqueSubsets = new HashSet<>();

        return splitHelper(s, uniqueSubsets, 0);
    }

    public static int splitHelper(String s, HashSet<String> uniqueSubsets, int start) {
        if (start == s.length()) return 0;

        int maxCount = 0;

        for (int i = start + 1; i <= s.length(); i++) {
            String currentSubstring = s.substring(start, i);

            if (!uniqueSubsets.contains(currentSubstring)) {
                uniqueSubsets.add(currentSubstring);
                maxCount = Math.max(maxCount, 1 + splitHelper(s, uniqueSubsets, i));
                uniqueSubsets.remove(currentSubstring);
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {
        System.out.println(maxUniqueSplit("ababccc"));
        System.out.println(maxUniqueSplit("aba"));
        System.out.println(maxUniqueSplit("aa"));
    }
}
