package Practice.Recursion;

public class FindIfArrayIsSorted {
    public static boolean isSorted(int[] arr, int index) {
        if (index == arr.length-1) return true;
        return arr[index] < arr[index +1] && isSorted(arr, ++index);
    }

    public static void main(String[] args) {
        System.out.println(isSorted(new int[]{1, 2, 6, 4, 5}, 0));
    }
}
