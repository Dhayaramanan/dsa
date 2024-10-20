package Array;

public class LemonadeChange {
    public static boolean lemonadeChange(int[] bills) {
        int[] income = new int[3]; // [0] = $5; [1] = $10; [2] = $20

        for (int bill : bills) {
            if (bill == 5) {
                income[0] += 1;
            }
            else if (bill == 10) {
                if (!(income[0] >= 1)) return false;
                income[1] += 1;
                income[0] -= 1;
            } else {
                if (!(income[0] >= 3 || (income[0] >= 1 && income[1] >= 1))) return false;

                income[2] += 1;
                if (income[1] >= 1) {
                    income[0] -= 1;
                    income[1] -= 1;
                }
                else {
                    income[0] -= 3;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(lemonadeChange(new int[]{5, 5, 5, 10, 20}));
        System.out.println(lemonadeChange(new int[]{5, 5, 10, 10, 20}));
    }
}
