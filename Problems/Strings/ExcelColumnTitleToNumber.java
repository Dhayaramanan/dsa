package Strings;

public class ExcelColumnTitleToNumber {

    public static int titleToNumber(String columnTitle) {
        int number = 0;

        for (int i = 0; i < columnTitle.length(); i++) {
            char ch = columnTitle.charAt(i);
            number = number * 26 + (ch - 'A' + 1);
        }

        return number;
    }

    public static void main(String[] args) {
        System.out.println(titleToNumber("A"));
        System.out.println(titleToNumber("AAB"));
        System.out.println(titleToNumber("ZY"));
    }
}

