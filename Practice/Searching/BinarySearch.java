package Practice.Searching;

public class BinarySearch {
    public static int binarySearch(int[] array, int key) {
        int start = 0;
        int end = array.length - 1;
        // int mid = (start + end) / 2;
        int mid = (start + end) / 2;

        while (start <= end) {
            if (array[mid] == key) {
                return mid;
            }
            if (array[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

            mid = (start + end) / 2;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array = {2, 4, 6, 9, 11, 12, 14, 20, 36, 48};
        // int key = 100;
        int key = 36;

        System.out.println(binarySearch(array, key));
    }
}
