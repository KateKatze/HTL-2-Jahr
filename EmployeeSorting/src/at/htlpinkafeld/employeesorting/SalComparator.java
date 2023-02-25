package at.htlpinkafeld.employeesorting;

import java.awt.*;
import java.util.Comparator;

public class SalComparator implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2){
        if (e1.getSal() < e2.getSal())
            return -1;
        if (e1.getSal() > e2.getSal())
            return 1;
        return e1.compareTo(e2);
    }
}
