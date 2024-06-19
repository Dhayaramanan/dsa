package Practice.Searching;

public class SearchInRange {
    public static void main(String[] args) {
        int[] array = {18, 12, -7, 3, 14, 28};
        int start = 1;
        int end = 4;
        int target = 3;

        int index = 0;
        boolean flag = false;
        for (int i = start; i <= end; ++i) {
            if (array[i] == target) {
                flag = true;
                index = i;
                break;
            }
        }
        if (flag)
            System.out.println("Element found at " + index);
        else
            System.out.println("Element not found");

    } 
}
