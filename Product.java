package at.htlpinkafeld.Market;

public abstract class Product {
    private String name;
    public Product(String name){
        this.name=name;
    }

    public abstract double getPrice();
    public final void show(){
        System.out.println(this.name + " " + this.getPrice() + "EUR");
    }
}
