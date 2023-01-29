package at.htlpinkafeld.TaxCalculator;

public abstract class Article {
    private String name;
    private double price;
    private String category;

    public abstract double getTax();
}
