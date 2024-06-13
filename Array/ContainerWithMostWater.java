package Array;

import java.util.Scanner;

public class ContainerWithMostWater {

    public static int calculateArea(int height1, int height2, int point1, int point2) {
        int length = (height1 < height2) ? height1 : height2;
        int breadth = point2 - point1;

        return (length * breadth);
    }

    public static int maxArea(int[] height) {
        int max = 0;

        // for (int i = 0; i < height.length; i++) {
        //     for (int j = height.length - 1; j >= i; j--) {
        //         int area = calculateArea(height[i], height[j], i, j);
        //         if (area > max)
        //             max = area;
        //     }
        // }

        int frontline = 0;
        int backline = height.length - 1;

        while (frontline < backline) {
            int area = calculateArea(height[frontline], height[backline], frontline, backline);
            if (area > max)
                max = area;
            
            if (height[frontline] <= height[backline])
                frontline++;
            else
                backline--;
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfVerticalLines = sc.nextInt();
        int[] height = new int[numberOfVerticalLines];

        for (int i = 0; i < numberOfVerticalLines; i++) {
            height[i] = sc.nextInt();
        }

        System.out.println(maxArea(height));

        sc.close();
    }
}
