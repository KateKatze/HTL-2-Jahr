package at.htlpinkafeld.listcheck;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListCheck {
    public static void main(String[] args) {
        List<Integer> alBeg = new ArrayList<>(100000);
        List<Integer> llBeg = new LinkedList<>();
        List<Integer> alEnd = new ArrayList<>();
        List<Integer> llEnd = new LinkedList<>();
        int count = 100000;

        System.out.print("ArrayList at beg:  ");
        fillRandom(alBeg, count, true);

        System.out.print("LinkedList at beg: ");
        fillRandom(llBeg, count, true);

        System.out.print("ArrayList at end:  ");
        fillRandom(alEnd, count, false);

        System.out.print("LinkedList at end: ");
        fillRandom(llEnd, count, false);
    }

    private static void fillRandom(List<Integer> lst, int count, boolean atBeg) {
        long timeStamp = System.nanoTime();
        int rnd;

        for (int idx = 0; idx < count; idx++) {
           rnd = (int)(Math.random()*100) + 1; // die Zahl zw. 1 und 100

        if (atBeg)
            lst.add(0, rnd);
        else
            lst.add(rnd);
            // lst.size - letzte freie Element lst.size() -1 letzte freie Index
        }

        System.out.println("Time for list-add in ns: " + ((System.nanoTime() - timeStamp)/1000000.0));
    }
}
