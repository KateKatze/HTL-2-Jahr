package at.htlpinkafeld.listcheck;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCheck {
    public static void main(String[] args) {
        Set<Integer> intSet = new HashSet<>();
        int copyCnt = 0;
        //create randoms
        while (intSet.size() < 10) {
            int num = (int)(Math.random() * 20);
            if (!intSet.add(num)) {  //intSet.add() returns false if Element exists already
                ++copyCnt;
            }
        }
        //show randoms
        for(Integer iVal: intSet) {
            System.out.print(iVal + " ");
        }
        System.out.println();
        System.out.println("copies ignored: " + copyCnt);
    }
}
