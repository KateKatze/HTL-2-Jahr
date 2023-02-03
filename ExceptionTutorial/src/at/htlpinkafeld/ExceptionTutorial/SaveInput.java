package at.htlpinkafeld.ExceptionTutorial;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SaveInput {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double in;
            do {
                System.out.println("Please enter a double number between -1 and 10!");
                in = saveDoubleInput(-1, 10);
                System.out.println("Your input: " + in);
            } while (in > 0);
    }
    private static double saveDoubleInput(double min, double max) {
        boolean repeat;
        double retVal = 0;
        do {
            repeat = false;
            try {
                retVal = scanner.nextDouble();
            } catch (InputMismatchException e) {
                repeat = true;
                scanner.nextLine(); // buffer löschen - gegen endlose schleife
                System.out.println("Invalid input. Try again.");
            }
        } while (repeat);
        return retVal;
    }
}
