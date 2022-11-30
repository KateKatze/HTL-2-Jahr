package at.htlpinkafeld.schoolhr;

public class MyDate {
    private int day, month, year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toJSON() {
        return "'birthdate': {" +
                "'day': " + day +
                ", 'month': " + month +
                ", 'year': " + year +
                '}';
    }
}
