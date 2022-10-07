package at.htlpinkafeld.trianglecheck;

import java.util.Scanner;

public class Trianglecheck {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        float a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the terrific Triangle Checker!" + "\n" +  "==================================" + "\n" + "\n" + "Enter the triangle legs: ");

        do {
            a = readFloat("a = ", 0, 1000);
            b = readFloat("b = ", 0, 1000);
            c = readFloat("c = ", 0, 1000);

            if (checkTriangle(a, b, c)) {
                System.out.println("\n" + "You have entered a valid triangle!");
                //2 decimals from a float num - String.format("%.02f", val)
                System.out.println("Perimeter: " + String.format("%.02f",calcPerimeter(a, b, c)));
                System.out.println("Area: " + String.format("%.02f", calcArea(a, b, c)));
            } else {
                System.out.println("Your input does not result in a triangle!");
            }

            System.out.println("\n"+ "Once more? (y/n) ");

        } while (input.next().equals("y"));
    }

    public static float readFloat(String txt,float min, float max){
        float i;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print(txt);
            i = input.nextFloat();
        }while (i < min || i > max);

        return i;
    }
    public static boolean checkTriangle(float a,float b,float c){
        return a < (b+c) && b < (a+c) && c < (a+b);
    }

    public static float calcPerimeter(float a,float b,float c) {
        return a+b+c;
    }
    public static float calcArea(float a,float b,float c) {
        float s = calcPerimeter(a,b,c)/2.0f;
        //Heron´s formula: sqrt(s * (s - a) * (s - b) * (s - c)
        //The Math.sqrt() function returns the square root of a number
        float heron = (float) Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return heron;
    }
}
