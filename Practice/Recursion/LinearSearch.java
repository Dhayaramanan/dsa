package Practice.Recursion;

import java.util.ArrayList;

public class LinearSearch {
    public static boolean linearSearch(int[] arr, int target, int index) {
        if (index == arr.length)
            return false;

        return arr[index] == target || linearSearch(arr, target, ++index);
    }

    public static int findIndex(int[] arr, int target, int index) {
        if (index == arr.length)
            return -1;

        if (arr[index] == target)
            return index;

        return findIndex(arr, target, ++index);
    }

//    public static ArrayList<Integer> findAll(int[] arr, int target, int index, ArrayList<Integer> list) {
//        if (index == arr.length) return list;
//        if (arr[index] == target) list.add(index);
//        return findAll(arr, target, ++index, list);
//    }

    public static ArrayList<Integer> findAll(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length) return list;

        if (arr[index] == target) list.add(index);

        ArrayList<Integer> allAnswers = findAll(arr, target, ++index);

        list.addAll(allAnswers);
        return list;
    }

    public static void main(String[] args) {
        System.out.println(linearSearch(new int[]{1, 2, 3, 4}, 5, 0));
        System.out.println(findIndex(new int[]{1, 2, 3, 4}, 4, 0));

//        ArrayList<Integer> list = new ArrayList<>();
        int[] arr = {1, 2, 3, 4, 4, 5, 4};
        int target = 4;
        System.out.println(findAll(arr, target, 0));
    }
}
