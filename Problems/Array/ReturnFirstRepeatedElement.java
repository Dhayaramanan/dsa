package Array;

import java.util.HashMap;

public class ReturnFirstRepeatedElement {

    public static int firstRepeatedElement(int[] array) {
        int zeroOrNegativeCount = 0;
        int length = array.length;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 2);

        int rep = array.length;
        int rep_count = 0;
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (array[i] <= 0 || array[j] <= 0) {
                    zeroOrNegativeCount++;
                    continue;
                }

                if (array[i] == array[j]) {
                    rep = Math.min(rep, j);
                    rep_count++;
                }
            }
        }

        if (rep_count == 0) return array[0];
        if (zeroOrNegativeCount == length) return 0;

        return array[rep];
    }

    public static void main(String[] args) {
        System.out.println(firstRepeatedElement(new int[]{1, 2, 3, 0, 5, 0, 3, 2, 7}));
    }
}
