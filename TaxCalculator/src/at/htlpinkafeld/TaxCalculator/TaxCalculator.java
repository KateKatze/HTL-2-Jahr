package at.htlpinkafeld.TaxCalculator;

public class TaxCalculator {
    public static void main(String[] args) {
        Taxable[] tax = new Taxable[5];
        tax[0] = new Clerk("Adam",5);
        tax[1] = new Worker("Mandy",173);
        tax[2] = new Food("Pizza",12);
        tax[3] = new Other("Tickets",220);
        tax[4] = new LuxuryArticle("Car",35000);

        System.out.println("The amount of the taxes (total) = " + getTotalTax(tax) + " €");
    }

    public static double getTotalTax(Taxable[] tax){
        double n=0;
        for (Taxable t: tax){
            n += t.getTax();
        }
        return n;
    };
}
