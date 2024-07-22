package Practice.Recursion;

import java.util.ArrayList;

public class Substrings {
    public static void main(String[] args) {
        substrings("", "abc");
        System.out.println(subRet("", "abc"));
    }

    public static void substrings(String p, String s) {
        if (s.isEmpty()) {
            System.out.println(p);
            return;
        }
        char c = s.charAt(0);

        substrings(p + c, s.substring(1));
        substrings(p, s.substring(1));
    }

    public static ArrayList<String> subRet(String p, String s) {
        if (s.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char c = s.charAt(0);
        ArrayList<String> left = subRet(p + c,s.substring(1));
        ArrayList<String> right = subRet(p, s.substring(1));

        left.addAll(right);

        return left;
    }
}
