package at.htlpinkafeld.RentalService;

public abstract class Fahrzeug {
    private int id;
    private String brand;
    private int year;

    public Fahrzeug(int id, String brand, int year) {
        this.id = id;
        this.brand = brand;
        this.year = year;
    }

    public abstract double getPrice();

}
