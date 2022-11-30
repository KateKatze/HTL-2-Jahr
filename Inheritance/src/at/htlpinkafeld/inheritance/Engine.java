package at.htlpinkafeld.inheritance;

public class Engine {
    private int power; //kw
    private double cap; //litre

    public Engine(int p, double c){
        this.power = p;
        this.cap = c;
    }

    @Override
    public String toString() {
        return "(" + this.power + "kW, " + this.cap + "l)";
        // (100 kW, 1.5l)
    }
}
