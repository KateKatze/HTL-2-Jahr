package at.htlpinkafeld.inheritance;

public class Truck extends Vehicle{
    private int n;

    public Truck(int pow, double cap, String brand, int nutzlast) {
        super(pow, cap, brand);
        this.n = n;
    }

    @Override
    public String toString() {
        return "Nutzlast: " + this.n + "t, " + super.toString();
    }
}
