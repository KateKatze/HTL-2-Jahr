package at.htlpinkafeld.TaxCalculator;

public class Worker extends Person {
    private int mthWorkHrs;

    public Worker(String name, int mthWorkHrs){
        super(name);
        this.mthWorkHrs=mthWorkHrs;
    }

    @Override
    public double getTax() {
       return this.mthWorkHrs*12*0.42;
    }
}
