package at.htlpinkafeld.RentalService;

public class Lkw extends Fahrzeug{
    private int drivenDistance;

    public Lkw(int drivenDistance, int id, String brand, int year) {
        super(id, brand, year);
        this.drivenDistance = drivenDistance;
    }

    @Override
    public double getPrice() {
        return 1.5*this.drivenDistance;
    }
}
