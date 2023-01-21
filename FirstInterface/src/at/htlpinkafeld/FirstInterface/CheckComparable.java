package at.htlpinkafeld.FirstInterface;

public class CheckComparable {
    public static void main(String[] args) {
        /*
        Sorter s = new Sorter;
        Comparable c = new String ("abc");
        Comparable c = "abc";
        c.compareTo("xyz");
        */
        Comparable[] texte = {"Strings", "are", "pairwise", "comparable"};
         // ascii capital letters smaller than normal ones
        System.out.println("Smallest: " + Sorter.getMin(texte));
        System.out.println("Biggest: " + Sorter.getMax(texte));

        Comparable[] cars = new Comparable[4];
        cars[0] = new Car("Volvo", 2022, 230, 1, 2,3);
        cars[1] =  new Car("BMW", 2019, 240, 2,3,4);
        cars[2] =  new Car("Man",2020, 250, 1,1,1);
        cars[3] =  new Car("Seat",2019, 250, 4,5,6);


        Sorter.sort(cars);
        for (int i=0; i<cars.length; ++i) {
            System.out.println(cars[i]);
        }

        //Comparable[] cars = {140,150,160,170};
        System.out.println("Smallest: " + Sorter.getMin(cars));
        System.out.println("Biggest: " + Sorter.getMax(cars));
    }
}
