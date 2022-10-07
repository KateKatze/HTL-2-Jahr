package at.htlpinkafeld.turtle;

import ch.aplu.turtle.Turtle;
import ch.aplu.turtle.TurtleFrame;

// pro class 1 file - public class also need to have the same name like the java class
public class Rectangle {
    // can be seen within this class
    int width;
    int height;

    //method
    public void print() {
        // not making int width here!! then we can´t get the value
        System.out.println("Rectangle: width = " + this.width);
    }

    public void draw() {
        Turtle t = new Turtle();
        t.hideTurtle();
        t.right(90);
        t.forward(width);
        t.right(90);
        t.forward(height);
        t.right(90);
        t.forward(width);
        t.right(90);
        t.forward(height);
    }
}
