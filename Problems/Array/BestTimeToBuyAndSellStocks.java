package Array;

import java.util.Arrays;
import java.util.Scanner;

public class BestTimeToBuyAndSellStocks {

    public static int maxProfit(int[] prices) {
        int currentDay = 0;
        int profit = 0;
        while (currentDay < prices.length) {
            int maxDay = getMax(Arrays.copyOfRange(prices, currentDay+1, prices.length));
            if (maxDay != 0 && (prices[currentDay] < maxDay)) {
                    int tempProfit = maxDay - prices[currentDay];
                    if (tempProfit > profit)
                        profit = tempProfit;
            }
            currentDay++;
        }
        return profit;
        /*
        SOLUTION
        int buy = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            } else if (prices[i] - buy > profit) {
                profit = prices[i] - buy;
            }
        }
        return profit;
         */
    }

    public static int getMax(int[] arr) {
        if(Arrays.stream(arr).max().isPresent())
            return Arrays.stream(arr).max().getAsInt();
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] prices = new int[n];

        for (int i = 0; i < n; i++) {
            prices[i] = in.nextInt();
        }

        System.out.println(maxProfit(prices));

        in.close();
    }
}
