package Array;

public class MaximumPointsYouCanObtainFromCards {
    public static int maxScore(int[] cardPoints, int k) {
        int totalSum = 0;
        int n = cardPoints.length;
        for (int cardPoint : cardPoints) {
            totalSum += cardPoint;
        }

        int windowSum = 0;
        for (int i = 0; i < n - k; i++) {
            windowSum += cardPoints[i];
        }

        int answer = totalSum - windowSum;
        for (int i = n - k; i < n; i++) {
            windowSum -= cardPoints[i - (n - k)];
            windowSum += cardPoints[i];

            answer = Math.max(answer, totalSum - windowSum);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] cardPoints = {1,79,80,1,1,1,200,1};
        int k = 3;
        System.out.println(maxScore(cardPoints, k));
    }
}
