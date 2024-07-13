package Array;

public class FindTheOriginalArrayOfPrefixXor {

    public static int[] findArray(int[] pref) {
        int[] arr = new int[pref.length];
        arr[0] = pref[0];

        for (int i = 1; i < arr.length; ++i) {
            arr[i] = pref[i] ^ pref[i-1];
        }
        return arr;
    }

    public static void main(String[] args) {
        for (int i: findArray(new int[]{5, 2, 0, 3, 1})) {
            System.out.println(i);
        }
    }
}
