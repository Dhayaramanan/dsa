package Strings;

import java.util.*;

public class GroupAnagrams {

    /*
    TIME LIMIT EXCEEDED

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashSet<String> anagramsMaps = new HashSet<>();

        for (String s : strs) {
            anagramsMaps.add(sortString(s));
        }

        List<List<String>> result = new ArrayList<>();

        for (String map : anagramsMaps) {
            List<String> intermediate = new ArrayList<>();

            for (String s : strs) {
                if (map.equals(sortString(s))) intermediate.add(s);
            }
            result.add(intermediate);
        }

        return result;
    }
     */
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            String s = sortString(str);
            if (map.containsKey(s)) {
                map.get(s).add(str);
            } else {
                map.put(s, new ArrayList<>());
                map.get(s).add(str);
            }
        }

        List<List<String>> result = new ArrayList<>();
        for (String key : map.keySet()) {
            result.add(map.get(key));
        }

        return result;
    }

    private static String sortString(String s) {
        char[] a = s.toCharArray();
        Arrays.sort(a);

        return new String(a);
    }

    public static void main(String[] args) {
        List<List<String>> result = groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});

        for (List<String> rs : result) {
            System.out.println(rs);
        }

        result = groupAnagrams(new String[]{""});
        for (List<String> rs : result) {
            System.out.println(rs);
        }
    }
}
