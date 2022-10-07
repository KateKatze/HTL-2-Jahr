package at.htlpinkafeld.turtle;

import ch.aplu.turtle.Turtle;
import ch.aplu.turtle.TurtleFrame;

public class TurtleCheck {
    /*
    public static void main(String[] args) {
        //2 turtles in one frame
        TurtleFrame frame = new TurtleFrame();

        //import class by Turtle right click -> import class ---> info index.html class Turtle
        //like this it´s gonna be 2 playgrounds
        Turtle t = new Turtle(frame);
        Turtle t2 = new Turtle(frame);

        //everything for the circle
        t2.leftCircle(70);

        //everything for the star-turtle
        t.hideTurtle();
        t.setPenColor("blue");
        t.setLineWidth(7);

        //start with horizontal line
        t.right(90);

        //made the speed 2 times faster
        t.speed(t.getSpeed()*2);

        //loop for the star
        for (int i=0; i <=5; i++){
            t.forward(200);
            t.right(144);
        }
        }
    */

    public static void main(String[] args) {
        //object from the class
        Rectangle r = new Rectangle();
        Rectangle r2 = new Rectangle();

        r.width = 5;
        r.height = 3;
        r2.height = 30;
        r2.width = 50;
        //called the method
        r.print();
        r2.print();


        Turtle main = new Turtle();

        Rectangle r1 = new Rectangle();
        r1.height = 50;
        r1.width = 100;
        r1.drawTurtle = main;
        r1.draw();

        Rectangle r3 = new Rectangle();
        r3.height = 150;
        r3.width = 250;
        r3.drawTurtle = main;
        r3.draw();
    }
}
