package at.htlpinkafeld.Market;

public class Article extends Product {
    private double netPrice;
    public Article(String name, double netPrice){
        super(name);
        this.netPrice=netPrice;
    }
    @Override
    public double getPrice() {
        return this.netPrice*1.2;
    }
}
