package Strings;

public class ExcelSheetColumnTitle {

    public static String convertToTitle(int columnNumber) {
        StringBuilder string = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--;
            char ch = (char) ('A' + columnNumber % 26);
            string.append(ch);
            columnNumber /= 26;
        }

        return string.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(convertToTitle(701));
        System.out.println(convertToTitle(26));
        System.out.println(convertToTitle(1));
        System.out.println(convertToTitle(1242321312));
    }
}

