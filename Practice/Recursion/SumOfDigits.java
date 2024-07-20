package Practice.Recursion;

public class SumOfDigits {

    public static int sum(int number) {
        if (number == 0) return number;
        return (number %10) + sum(number /10);
    }

    public static void main(String[] args) {
        System.out.println(sum(342));
        System.out.println(sum(123456));
    }
}
