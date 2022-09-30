package at.htlpinkafeld.io;

import java.util.Scanner;

public class IOCheck {
        /*
        public static void main(String[] args) {
            //int x = 5;
            //System.out.println("Expression: " + x);
            //System.out.println("Expression: " + 2 + 1); Expression 21
            //System.out.println("Expression: " +( 2 + 1)); Expression 3
            //System.out.println("Expression: " + 2 * 2); Expression 4
            //System.out.print("Expression: " );
            //System.out.println((float)x/2);

            int age = 5;
            Scanner input = new Scanner(System.in);  //wartet, bis der User in der Console ein int eingibt
            System.out.print("Eingabe: age = ");
            age = input.nextInt();
            System.out.println("Age: " + age);
            //System.out.println("Age: " + (double) age); kommt mit .0 aus -> 12.0
        }

        public static void main(String[] args) {
            int i;
            int fakultzahl;
            int faktorial = 1;
            Scanner input = new Scanner(System.in);
            System.out.print("Ausgabe aller Faktoriellen bis: ");
            fakultzahl = input.nextInt();
            for (i=1; i <= fakultzahl; i++) {
                faktorial = faktorial * i; // oder faktorial *= i
                System.out.println(fakultzahl + "! = " + faktorial);
            }
        }

    public static void main(String[] args) {
        int upper;
        Scanner input = new Scanner(System.in);
        System.out.print("Berechne Faktoriellen von: ");
        upper = input.nextInt();
        System.out.println(upper + "! = " + fakt(upper));
    }

    public static int fakt (int upper) {
        int f = 1;
        for (int n=2; n<=upper; n++ ) {
            f *= n;
        }
        return f;
    }

         */
 static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int upper;

        upper = readInt("Berechne Faktorielle von: ", 1, 12);
        System.out.println(upper + "! = " + fakt(upper));
    }

    public static int readInt(String txt, int min, int max) {
        int retVal;
        System.out.print(txt);

        do {
            retVal = input.nextInt();
            if (retVal < min || retVal > max) {
                System.out.println("Die Zahl soll zwischen " + min + " und " + max + " sein");
                System.out.print(txt);
            }
        } while (retVal < min || retVal > max);

        return retVal;
    }

    public static int fakt (int upper) {
        int f = 1;
        for (int n=2; n<=upper; n++ ) {
            f *= n;
        }
        return f;
    }
}
