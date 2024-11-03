package Strings;

public class RotateString {

    public static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;

        String doubleS = s + s;

        return doubleS.contains(goal);
    }

    public static void main(String[] args) {
        System.out.println(rotateString("abcde", "cdeab"));
        System.out.println(rotateString("abcde", "abced"));
    }
}
