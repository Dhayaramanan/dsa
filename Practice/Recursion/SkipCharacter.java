package Practice.Recursion;

public class SkipCharacter {

    public static void main(String[] args) {

        skip("", "bcaada");
        System.out.println(skip("bcaada"));

    }

    public static void skip(String p, String s) {
        if (s.isEmpty()) {
            System.out.println(p);
            return;
        }

        char c = s.charAt(0);

        if (c == 'a') {
            skip(p, s.substring(1));
        } else {
            skip(p+c, s.substring(1));
        }
    }

    public static String skip(String s) {
        if (s.isEmpty()) return "";

        char c = s.charAt(0);

        if (c == 'a') {
            return skip(s.substring(1));
        }
        return c + skip(s.substring(1));
    }
}
