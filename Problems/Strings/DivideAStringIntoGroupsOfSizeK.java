package Strings;

import java.util.ArrayList;
import java.util.Arrays;

public class DivideAStringIntoGroupsOfSizeK {
    public static String[] divideString(String s, int k, char fill) {
        ArrayList<String> splitString = new ArrayList<>();

        int length = s.length();
        for (int i = 0; i < length; i += k) {
            int endIndex = Math.min(length, i + k);

            StringBuilder text = new StringBuilder(s.substring(i, endIndex));

            int appendLength = k - text.length();
            text.append(String.valueOf(fill).repeat(Math.max(0, appendLength)));

            splitString.add(text.toString());
        }
        String[] result = new String[splitString.size()];

        for (int i = 0; i < result.length; i++) {
            result[i] = splitString.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "abcdefghij";
        char fill = 'x';
        int k = 3;

        System.out.println(Arrays.toString(divideString(s, 3, fill)));

        s = "abcdefghi";
        fill = 'x';
        k = 3;
        System.out.println(Arrays.toString(divideString(s, k, fill)));
    }
}
