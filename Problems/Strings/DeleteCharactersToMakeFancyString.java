package Strings;

public class DeleteCharactersToMakeFancyString {

    public static String makeFancyString(String s) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int length = result.length();

            if (length >= 2 && result.charAt(length - 1) == currentChar && result.charAt(length - 2) == currentChar) {
                continue;
            }
            result.append(currentChar);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(makeFancyString("leeetcode"));
    }
}
