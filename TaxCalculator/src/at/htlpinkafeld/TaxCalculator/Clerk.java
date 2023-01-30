package at.htlpinkafeld.TaxCalculator;

public class Clerk extends Person {
    private int ttlWorkYrs;

    public Clerk(String name, int ttlWorkYrs){
        super(name);
        this.ttlWorkYrs=ttlWorkYrs;
    }

    @Override
    public double getTax() {
        return this.ttlWorkYrs*0.42;
    }
}
