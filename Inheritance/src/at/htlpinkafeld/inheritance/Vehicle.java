package at.htlpinkafeld.inheritance;

public class Vehicle {
    private Engine engine;
    private String brand;
    public Vehicle(int pow, double cap, String br) {
        this.engine = new Engine(pow, cap);
        this.brand = br;
    }

    public String toString(){
        // Volvo (450kW, 5.6l)
        return this.brand + " " + this.engine.toString();
    }
}
