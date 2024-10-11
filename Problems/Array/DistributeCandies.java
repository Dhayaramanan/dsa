package Array;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DistributeCandies {

    public static int distributeCandies(int[] candyType) {
        Set<Integer> candySet = IntStream.of(candyType).boxed().collect(Collectors.toSet());
        int allowedTypes = candyType.length / 2;
        int availableTypes = candySet.size();

        return Math.min(availableTypes, allowedTypes);
    }

    public static void main(String[] args) {
        System.out.println(distributeCandies(new int[]{1, 1, 2, 2, 3, 3}));
        System.out.println(distributeCandies(new int[]{1, 1, 2, 3}));
        System.out.println(distributeCandies(new int[]{6, 6, 6, 6}));
    }
}
