package Strings;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter {
    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < words.length; ++i) {
            if (words[i].contains(Character.toString(x)))
                result.add(i);
        }
        return result;
    }

    public static void main(String[] args) {
        String[] words = {"lsjdflksda", "lsjdflsd", "oweurweoi"};
        System.out.println(findWordsContaining(words, 'o'));
    }
}
