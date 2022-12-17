package at.htlpinkafeld.Gehaltsberechnung;

public class OfficeWorker extends Employee{
    private double grundgehalt;
    private double zulage;

    public OfficeWorker(double grundgehalt, double zulage, int empNo, String name) {
        super(empNo, name);
        this.grundgehalt = grundgehalt;
        this.zulage = zulage;
    }

    @Override
    public double getWage() {
        return this.grundgehalt + this.zulage;
    }
}
