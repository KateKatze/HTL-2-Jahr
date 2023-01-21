package at.htlpinkafeld.FirstInterface;

public class Sorter {
    public static Object getMin(Comparable[] cArr) {
        Object min = null;
        if (cArr.length > 0) {
            min = cArr[0];
        }
        for(int idx=1; idx< cArr.length; idx++){
            if (cArr[idx].compareTo(min) < 0) {
                min = cArr[idx];
            }
        }
        return min;
    }

    public static Object getMax(Comparable[] cArr) {
        Object maxs = null;
        if (cArr.length > 0) {
            maxs = cArr[0];
        }
        for(int idx=0; idx < cArr.length; idx++){
            if (cArr[idx].compareTo(maxs) > 0) {
                maxs = cArr[idx];
            }
        }
        return maxs;
    }
}
