package at.htlpinkafeld.RentalService;


public class RentalService {
    private static double calcTotalIncome(Fahrzeug[] autos){
        double retVal = 0;

        for(Fahrzeug f : autos)
            retVal += f.getPrice();
        return retVal;
    }

    public static void main(String[] args) {
        Fahrzeug[] fahrzeuge = new Fahrzeug[4];
        fahrzeuge[0] = new Pkw(1, "Mazda", 2020, 3, 4);
        fahrzeuge[1] = new Lkw(200000, 3, "Man", 2019);
        fahrzeuge[2] = new Lkw(150000, 4, "Scania", 2018);
        fahrzeuge[3] = new Pkw(2, "Seat", 2020, 3, 4);

    double totPrice;

    totPrice = calcTotalIncome(fahrzeuge);
    System.out.println("The overall price is: " + totPrice);
    }
}
