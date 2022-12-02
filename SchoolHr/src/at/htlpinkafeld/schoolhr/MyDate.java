package at.htlpinkafeld.schoolhr;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toJSON() {
        return "{'day': " + day +
                ", 'month': " + month +
                ", 'year': " + year + "}";
    }
}
