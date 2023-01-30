package at.htlpinkafeld.TaxCalculator;

public abstract class Person implements Taxable {
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Person(String name){
        this.name = name;
    }
}
