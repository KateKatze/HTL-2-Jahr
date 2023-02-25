package at.htlpinkafeld.employeesorting;

import java.util.Comparator;

public class DeptComparator implements Comparator<String> {
    public int compare(String e1, String e2) {
        return e2.compareTo(e1);
    }
}
