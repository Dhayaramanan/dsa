package Strings;

import java.util.HashMap;

public class JewelsAndStones {
    public static int numJewelsInStones(String jewels, String stones) {
        HashMap<Character, Integer> jewelSet = new HashMap<>();
        for (int i = 0; i < jewels.length(); ++i) {
            jewelSet.put(jewels.charAt(i), 1);
        }

        int jewelCount = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (jewelSet.containsKey(stones.charAt(i))) jewelCount += 1;
        }

        return jewelCount;
    }

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA", "aAAbbcc"));
    }
}
