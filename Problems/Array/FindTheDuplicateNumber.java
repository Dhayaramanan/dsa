package Array;

public class FindTheDuplicateNumber {
    public static int findDuplicate(int[] nums) {
        boolean[] present = new boolean[nums.length]; // because nums contain elements in range 1-n
        for (int i : nums) {
            if (present[i]) return i;
            present[i] = true;
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(findDuplicate(new int[]{1,2, 3, 4, 5, 4}));
    }
}
