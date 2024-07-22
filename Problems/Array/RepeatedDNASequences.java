package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RepeatedDNASequences {
    public static List<String> findRepeatedDnaSequences(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        List<String> result  = new ArrayList<>();

        int target_len = 10;
        for (int i = 0; i <= s.length()-target_len; i++) {
            String subString = s.substring(i, i+target_len);
            if (!map.containsKey(subString)) {
                map.put(subString, s.indexOf(subString));
            } else {
                if (!result.contains(subString))
                    result.add(subString);
            }
        }

        return result;

        /*
        USING HASHSET
        HashSet<String> set = new HashSet<>();
        List<String> result  = new ArrayList<>();

        int target_len = 10;
        for (int i = 0; i <= s.length()-target_len; i++) {
            String subString = s.substring(i, i+target_len);
            boolean isNew = set.add(subString);
            if (!isNew && !result.contains(subString)) {
                    result.add(subString);
            }
        }

        return result;
         */
    }

    public static void main(String[] args) {
        String s = "AAAAAAAAAAA";
        System.out.println(findRepeatedDnaSequences(s));
    }
}
