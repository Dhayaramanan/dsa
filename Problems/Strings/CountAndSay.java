package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountAndSay {

    public static String countAndSay(int n) {
        if (n == 1)
            return "1";

        return say(n);
    }

    private static String say(int n) {
        String result = "1";

        for (int i = 1; i < n; ++i) {
            result = generateString(count(result));
        }

        return result;
    }

    private static List<List<Integer>> count(String s) {
        List<List<Integer>> map = new ArrayList<>();

        int i = 0;
        while (i < s.length()) {
            char currentChar = s.charAt(i);
            int count = 1;
            while (i + 1 < s.length() && s.charAt(i + 1) == currentChar) {
                count++;
                i++;
            }

            map.add(Arrays.asList(count, Integer.parseInt(String.valueOf(s.charAt(i)))));
            i++;
        }

        return map;
    }

    private static String generateString(List<List<Integer>> map) {
        StringBuilder result = new StringBuilder();

        for (List<Integer> frequency : map) {
            result.append(frequency.get(0));
            result.append(frequency.get(1));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(1));
        System.out.println(countAndSay(4));
    }
}
