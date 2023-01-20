package at.htlpinkafeld.Market;

public class Service extends Product {
    private Duration dur;

    public Service(String name, int h, int m){
        super(name);
        dur = new Duration(h, m);
    }
    public double getPrice() {
        return 5.0 + dur.toMin()*0.5;
    }
}
