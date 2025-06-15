package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class Dota2Senate {
    public static String predictPartyVictory(String s) {
        int rCount = 0;
        int dCount = 0;

        Queue<Character> queue = new LinkedList<>();
        for (char c : s.toCharArray()) queue.add(c);

        for (char c : s.toCharArray()) {
            if (c == 'R') ++rCount;
            else ++dCount;
        }

        while (rCount > 0 && dCount > 0) {
            char current = queue.poll();

            if (current == 'R') {
                queue.remove('D');
                dCount--;
                queue.offer(current);
            } else {
                queue.remove('R');
                rCount--;
                queue.offer(current);
            }
        }

        return rCount > 0 ? "Radiant" : "Dire";
    }

    public static void main(String[] args) {
        System.out.println(predictPartyVictory("RD"));
        System.out.println(predictPartyVictory("RDD"));
    }

}
