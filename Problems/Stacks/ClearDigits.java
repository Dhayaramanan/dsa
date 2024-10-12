package Stacks;

public class ClearDigits {
    public static String clearDigits(String s) {
        StringBuilder result = new StringBuilder();

        for (Character i : s.toCharArray()) {
            if (Character.isDigit(i)) result.deleteCharAt(result.length() - 1);
            else result.append(i);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(clearDigits("abc"));
        System.out.println(clearDigits("cb34"));
    }
}
