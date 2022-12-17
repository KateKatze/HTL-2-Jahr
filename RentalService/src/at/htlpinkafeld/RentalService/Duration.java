package at.htlpinkafeld.RentalService;

public class Duration{
    private int tage;
    private int stunden;

    public Duration(int tage, int stunden) {
        this.tage=tage;
        this.stunden=stunden;
    }

    int tag;
    public double getInHours() {
        tag = tage*24;
        return tag;
    }
}
