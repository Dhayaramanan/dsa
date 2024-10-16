package Array;

import java.util.Arrays;

public class AssignCookies {

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int count = 0;

        int gPtr = 0;
        int sPtr = 0;

        while (gPtr < g.length && sPtr < s.length) {
            if (g[gPtr] <= s[sPtr]) {
                count++;
            }
            else {
                sPtr++;
                continue;
            }

            gPtr++;
            sPtr++;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(findContentChildren(new int[]{1,2,3}, new int[]{1, 1}));
        System.out.println(findContentChildren(new int[]{1, 2}, new int[]{1, 2, 3}));
    }
}
