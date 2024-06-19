package Practice.Searching;

import java.util.Scanner;

public class LinearSearch {
    private int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key)
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] array = {1, 2, 3, 4, 5};
        int key = in.nextInt();

        LinearSearch ls = new LinearSearch();
        System.out.println(key + " is present at index " + ls.linearSearch(array, key));

        in.close();
    }
}
