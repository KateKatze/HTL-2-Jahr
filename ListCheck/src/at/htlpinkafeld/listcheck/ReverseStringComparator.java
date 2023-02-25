package at.htlpinkafeld.listcheck;
import java.util.Comparator;

public class ReverseStringComparator implements Comparator<String> {
    public int compare(String s1, String s2){
        return -s1.compareTo(s2); //oder s2.compareTo(s1)
    }
}
