package Array;

// Given n number of water bottles, selling each one year. The 'Profit' will be sum of (year * value of water bottle)
// The water bottle in packet can be taken only from front and back side
// find the maximum profit that can be obtained

import java.util.Scanner;

public class MaxProfit {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        
        int[] price = new int[n];
        
        for (int i = 0; i < n; ++i) {
            price[i] = in.nextInt();
        }
        
        int profit = 0;
        int year = 1;
        
        for (int i = 0, j = n - 1; i <= j;) {
            int first = price[i];
            int last = price[j];
            
            if (first < last) {
                profit += year * first;
                i += 1;
            }
            else {
                profit += year * last;
                j -= 1;
            }
            
            
            year += 1;
        }
        
        System.out.println(profit);
        in.close();
    }
}
