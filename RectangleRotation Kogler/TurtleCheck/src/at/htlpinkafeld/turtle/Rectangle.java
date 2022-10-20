package at.htlpinkafeld.turtle;

import ch.aplu.turtle.Turtle;

import java.awt.*;

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
