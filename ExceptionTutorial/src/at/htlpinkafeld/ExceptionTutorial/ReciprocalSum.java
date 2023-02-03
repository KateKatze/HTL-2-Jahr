package at.htlpinkafeld.ExceptionTutorial;

import java.lang.reflect.Array;

public class ReciprocalSum {
    public static void main(String[] args) {
        double x;

        try {
            int beg = Integer.parseInt(args[0]);
            int end = Integer.parseInt(args[1]);
            x = progressionSum(beg, end);

            System.out.println("");
            System.out.println("Progression Result: " + x);
        }  catch (ArrayIndexOutOfBoundsException | NumberFormatException e) { //hier steht die referenz auf den gefangenen objekt // kann man einfach nur Exception e schreiben, dann werden alle Fehler gefangen
            System.out.println("error: " + e.toString());
            System.out.println("Program usage: java ReciprocalSum startValue endValue");
        }
    }
    private static double progressionSum(int start, int stop) {
        double retVal = 0;

        for(int val=start; val <= stop; val++){
            try {
                retVal = retVal + reciprocal(val);
                System.out.print("1/" + val + " ");
            } catch (ArithmeticException e) {
                // do nothing - is bad!!! immer eine Anweisung geben
            }
        }
        return retVal;
    }
    private static double reciprocal(double val) { //add "throws Exception" to catch any exception
        double retVal = 1/val;
        if(Double.isInfinite(retVal))
            throw new ArithmeticException("Double-division by zero");
        return retVal;
    }
}
// javadoc scanner -> iwelche methode -> throws