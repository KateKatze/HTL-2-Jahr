package at.htlpinkafeld.Market;

public class MarketApp {
    public static void main(String[] args) {
        Product[] prods = new Product[3];
        double grandTotal;

        prods[0] = new Article("haah", 1);
        prods[1] = new Service("kdkdkd", 1,1);
        prods[2] = new Article("shfdjff", 2);

        grandTotal = calcTotal(prods);

        System.out.println("Total price for all products: " + grandTotal + " EUR");
        System.out.print("First product: ");

        prods[0].show();
    }

    private static double calcTotal(Product[] pr){
        double total = 0;

        for(Product p: pr)
            total +=  p.getPrice();

        return total;
    }
}
