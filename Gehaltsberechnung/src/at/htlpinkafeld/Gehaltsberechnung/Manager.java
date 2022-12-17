package at.htlpinkafeld.Gehaltsberechnung;

public class Manager extends Employee {
    private double fixgehalt;
    private double zulage;
    private double umsatzbeteiligung;
    private double ueberstundenpauschale;
    private double provision;

    public Manager(double fixgehalt, double zulage, double umsatzbeteiligung, double ueberstundenpauschale, double provision, int empNo, String name) {
        super(empNo, name);
        this.fixgehalt = fixgehalt;
        this.zulage = zulage;
        this.umsatzbeteiligung = umsatzbeteiligung;
        this.ueberstundenpauschale = ueberstundenpauschale;
        this.provision = provision;
    }

    @Override
    public double getWage() {
        return this.fixgehalt + this.zulage + this.umsatzbeteiligung + this.ueberstundenpauschale + this.provision;
    }
}
