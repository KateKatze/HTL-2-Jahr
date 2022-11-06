package at.htlpinkafeld.turtle;

import ch.aplu.turtle.Turtle;

import java.awt.*;

/*
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

    */

/*
// HÜ RectangleRotation

public class Rectangle {
    //setPos() functions with double
    double x, y;
    int width, height, angle;
    Turtle thommy;

    public void erase() {
        thommy.clean();
    }
    public void draw() {
        thommy.setPos(x,y);
        thommy.hideTurtle();
        thommy.setLineWidth(2);
        thommy.setPenColor(Color.red);

        for (int i = 0; i < 2; i++) {
            thommy.forward(width);
            thommy.right(90);
            thommy.forward(height);
            thommy.right(90);
        }
    }
    public void spin () {
        thommy.right(angle);
        thommy.sleep(20);
    }
}
 */
public class Circle {
    int cx, cy;
    double radius;
    Turtle mark;
    public void draw() {
        mark.setPos(cx,cy);
        mark.setRadius(radius);
        mark.hideTurtle();
        mark.setLineWidth(2);
        mark.setPenColor(Color.red);

        for (int i = 0; i < 1; i++) {
            thommy.right(360);
        }
    }
}
/*
public class Rectangle {
    int width, height, ulx, uly;
    Turtle gustl;


}

 */

