package at.htlpinkafeld.Market;

public class Duration {
    private int hour;
    private int min;

    public Duration(int hour, int min) {
        this.hour = hour;
        this.min = min;
    }
    public int toMin(){
        return this.hour*60+this.min;
    }
}
