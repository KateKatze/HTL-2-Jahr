package at.htlpinkafeld.TaxCalculator;

public abstract class Article implements Taxable{
    private String name;
    private double price;
    private double taxForArticle;
    public Article(String name, double price, double taxForArticle) {
        this.name=name;
        this.price=price;
        this.taxForArticle=taxForArticle;
    }
    public double getTax(){
        return this.price*this.taxForArticle;
    };
}
