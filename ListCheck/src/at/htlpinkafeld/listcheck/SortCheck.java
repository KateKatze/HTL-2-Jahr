package at.htlpinkafeld.listcheck;

import java.util.*;

public class SortCheck {
    public static void main(String[] args) {
            Comparator<String> comp = Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER);
            Set<String> strSet = new TreeSet<>(comp);  //natural order (using Comparable-Objects) new ReverseStringComparator()
            strSet.add("Kiwi");
            strSet.add("kirsche");
            strSet.add("Ananas");
            strSet.add("Zitrone");
            strSet.add("grapefruit");
            strSet.add("Banane");
            //Output using iterator
            /*
            Iterator<String> it = strSet.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }
             */
            for(String s : strSet){
                System.out.println(s);
            }
    }
}
