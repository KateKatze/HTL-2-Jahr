package at.htlpinkafeld.circlerect;
import ch.aplu.turtle.Turtle;
import java.awt.*;
import java.util.Scanner;

public class CircleRect {
    public static void main(String[] args) {
        int circlesAmount = 3;
        int givenRadius;

        Turtle kate = new Turtle();
        //Für alle Figuren gilt: Turtle: unsichtbar + Linienstärke: 2 + Farbe: rot
        kate.hideTurtle();
        kate.setLineWidth(2);
        kate.setPenColor(Color.red);

        // extra exercise
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to the CircleRect Program! Please type the radius value (int) here, so the Turtle can draw something for you: ");
        givenRadius = input.nextInt();

        // for width and height
        int diameter = givenRadius *2;

        for (int i = 0; i < circlesAmount; i++) {
            Circle round = new Circle(givenRadius, -100 + (diameter * i), 0, kate);
            if (i == 0) {
                Rectangle rectangle = new Rectangle(diameter * circlesAmount, diameter, round.cx - round.radius, round.cy + round.radius, kate);
                rectangle.draw();
            }
            round.draw();
        }
    }
}
