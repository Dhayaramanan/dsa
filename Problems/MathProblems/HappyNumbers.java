package MathProblems;

//import java.util.HashMap;

public class HappyNumbers {
/*
    public static boolean isHappy(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(n, 0);
        n = sumOfDigits(n);
        map.put(n, 0);

        while (n != 1) {
            n = sumOfDigits(n);
            if (map.get(n) != null) return false;
            map.put(n, 0);
        }

        return true;
        }
*/

//    using floyd tortoise
        public static boolean isHappy(int n) {
            int slow = n;
            int fast = n;

            do {
                slow = sumOfDigits(slow);
                fast = sumOfDigits(sumOfDigits(fast));
            } while (slow != fast);

            return slow == 1;
        }

    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += (int)Math.pow((n % 10), 2);
            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(19));
        System.out.println(isHappy(2));
    }
}
