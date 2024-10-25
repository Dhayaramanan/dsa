package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveSubFoldersFromTheFilesystem {
    public static List<String> removeSubfolders(String[] folder) {
        List<String> result = new ArrayList<>();

        Arrays.sort(folder);

        for (String s : folder) {
            if (result.isEmpty() || !s.startsWith(result.getLast() + "/"))
                result.add(s);
        }

        return result;
    }

    public static void main(String[] args) {
        String[] arr = new String[]{"/a","/a/b","/c/d","/c/d/e","/c/f"};
        System.out.println(removeSubfolders(arr));
    }
}
