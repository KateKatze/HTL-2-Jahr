package at.htlpinkafeld.RentalService;

public class Pkw extends Fahrzeug{
    private Duration rentalPeriod;

    public Pkw(int id, String brand, int year, int tage, int stunden) {
        super(id, brand, year);
        this.rentalPeriod = new Duration(tage, stunden);
    }

    public double getPrice() {
        return 5.5* this.rentalPeriod.getInHours();
    }
}
