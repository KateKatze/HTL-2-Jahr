package at.htlpinkafeld.turtle;

import ch.aplu.turtle.Turtle;
import ch.aplu.turtle.TurtleFrame;

// pro class 1 file - public class also need to have the same name like the java class
public class Rectangle {
    // can be seen within this class
    int width;
    int height;
    Turtle drawTurtle;
    //Turtle t; - for HÜ, we can save here a variable

    //method
    public void print() {
        // not making int width here!! then we can´t get the value
        System.out.println("Rectangle: width = " + this.width);
    }

    public void draw() {
        drawTurtle.hideTurtle();
        drawTurtle.right(90);
        drawTurtle.forward(width);
        drawTurtle.right(90);
        drawTurtle.forward(height);
        drawTurtle.right(90);
        drawTurtle.forward(width);
        drawTurtle.right(90);
        drawTurtle.forward(height);
    }
}
